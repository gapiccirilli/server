package com.angelopicc.flicksfeed.services;

import java.util.List;

import com.angelopicc.flicksfeed.payload.PostDto;

public interface PostService {
    
    PostDto createPost(PostDto post);
    PostDto getPostById(long postId);
    List<PostDto> getAllPosts(long userId);
    List<PostDto> getPostsBySearch(String query);
    PostDto updatePost(PostDto newPost, long oldPostId);
    void deletePost(long postId);
}
