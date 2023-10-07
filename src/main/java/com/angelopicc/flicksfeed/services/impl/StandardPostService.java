package com.angelopicc.flicksfeed.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.payload.PostDto;
import com.angelopicc.flicksfeed.services.PostService;

@Service
public class StandardPostService implements PostService {

    @Override
    public PostDto createPost(PostDto post) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPost'");
    }

    @Override
    public PostDto getPostById(long postId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPostById'");
    }

    @Override
    public List<PostDto> getAllPosts(long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPosts'");
    }

    @Override
    public List<PostDto> getPostsBySearch(String query) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPostsBySearch'");
    }

    @Override
    public PostDto updatePost(PostDto newPost, long oldPostId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePost'");
    }

    @Override
    public void deletePost(long postId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePost'");
    }
    
}
