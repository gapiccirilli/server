package com.angelopicc.flicksfeed.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.entities.Post;
import com.angelopicc.flicksfeed.entities.User;
import com.angelopicc.flicksfeed.exceptions.PostNotFoundException;
import com.angelopicc.flicksfeed.exceptions.UserNotFoundException;
import com.angelopicc.flicksfeed.payload.PostDto;
import com.angelopicc.flicksfeed.repositories.PostRepository;
import com.angelopicc.flicksfeed.repositories.UserRepository;
import com.angelopicc.flicksfeed.services.PostService;

@Service
public class StandardPostService implements PostService {

    private PostRepository postRepository;
    private UserRepository userRepository;

    public StandardPostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @Override
    public PostDto createPost(PostDto post) {
        Post entity = mapToEntity(post);
        User user = userRepository.findById(post.getUserId())
            .orElseThrow(() -> new UserNotFoundException("User with id: " + post.getUserId() + " can't be found"));
        
        entity.setUser(user);
        Post savedEntity = postRepository.save(entity);
        return mapToDto(savedEntity);
    }

    @Override
    public PostDto getPostById(long postId) {
        Post post = postRepository.findById(postId)
            .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + " can't be found"));

            return mapToDto(post);
    }

    @Override
    public List<PostDto> getAllPosts(long userId) {
        List<Post> posts = postRepository.findAllPostsByUserId(userId);
        List<PostDto> dtos = posts.stream()
                                .map(post -> mapToDto(post))
                                .collect(Collectors.toList());

        return dtos;
    }

    @Override
    public List<PostDto> getPostsBySearch(String query) {
        // implement later with JDBC
        return null;
    }

    @Override
    public PostDto updatePost(PostDto newPost, long oldPostId) {

        Post oldPost = postRepository.findById(oldPostId)
                .orElseThrow(() -> new PostNotFoundException("Post with id: " + oldPostId + " can't be found"));
        
        oldPost.setTitle(newPost.getTitle());
        oldPost.setGenre(newPost.getGenre());
        oldPost.setDirector(newPost.getDirector());
        oldPost.setRated(newPost.getRated());
        oldPost.setReleased(newPost.getReleased());
        oldPost.setRottenScore(newPost.getRottenScore());
        oldPost.setImdbScore(newPost.getImdbScore());
        oldPost.setRating(newPost.getRating());
        oldPost.setContent(newPost.getContent());
        oldPost.setImage(newPost.getImage());

        Post updatedPost = postRepository.save(oldPost);
        return mapToDto(updatedPost);
    }

    @Override
    public void deletePost(long postId) {
        postRepository.findById(postId)
            .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + " can't be found"));

        postRepository.deleteById(postId);
    }

    private static Post mapToEntity(PostDto dto) {
        Post post = new Post();
        post.setId(dto.getId());
        post.setTitle(dto.getTitle());
        post.setGenre(dto.getGenre());
        post.setDirector(dto.getDirector());
        post.setRated(dto.getRated());
        post.setReleased(dto.getReleased());
        post.setRottenScore(dto.getRottenScore());
        post.setImdbScore(dto.getImdbScore());
        post.setRating(dto.getRating());
        post.setContent(dto.getContent());
        post.setImage(dto.getImage());
        return post;
    }

    private static PostDto mapToDto(Post entity) {
        PostDto dto = new PostDto();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setGenre(entity.getGenre());
        dto.setDirector(entity.getDirector());
        dto.setRated(entity.getRated());
        dto.setReleased(entity.getReleased());
        dto.setRottenScore(entity.getRottenScore());
        dto.setImdbScore(entity.getImdbScore());
        dto.setRating(entity.getRating());
        dto.setContent(entity.getContent());
        dto.setImage(entity.getImage());
        dto.setUserId(entity.getUser().getId());
        return dto;
    }
    
}
