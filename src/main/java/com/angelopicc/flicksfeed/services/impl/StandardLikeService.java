package com.angelopicc.flicksfeed.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.entities.Like;
import com.angelopicc.flicksfeed.entities.Post;
import com.angelopicc.flicksfeed.exceptions.PostNotFoundException;
import com.angelopicc.flicksfeed.payload.LikeDto;
import com.angelopicc.flicksfeed.repositories.LikeRepository;
import com.angelopicc.flicksfeed.repositories.PostRepository;
import com.angelopicc.flicksfeed.services.LikeService;

@Service
public class StandardLikeService implements LikeService {

    private LikeRepository likeRepository;
    private PostRepository postRepository;

    public StandardLikeService(LikeRepository likeRepository, PostRepository postRepository) {
        this.likeRepository = likeRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void like(LikeDto like) {
        Post post = postRepository.findById(like.getPostId())
                .orElseThrow(() -> new PostNotFoundException("Post with id: " + like.getPostId() + " can't be found"));

        Like newLike = new Like(like.getId(), like.getUserId(), post);
        likeRepository.save(newLike);
    }

    @Override
    public void unlike(long likeId) {
        boolean likeExists = likeRepository.existsById(likeId);

        if(likeExists) {
            likeRepository.deleteById(likeId);
        }
    }

    @Override
    public List<LikeDto> getAllLikes(long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + " can't be found"));
        
        List<Like> likes = post.getLikes();

        return likes.stream()
                .map(like -> new LikeDto(like.getId(), like.getUserId(), like.getPost().getId()))
                .collect(Collectors.toList());
    }
}
