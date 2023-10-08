package com.angelopicc.flicksfeed.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.payload.LikeDto;
import com.angelopicc.flicksfeed.services.LikeService;

@Service
public class StandardLikeService implements LikeService {

    @Override
    public void like(long userId, long postId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'like'");
    }

    @Override
    public void unlike(long userId, long postId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unlike'");
    }

    @Override
    public List<LikeDto> getAllLikes(long postId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllLikes'");
    }
    
}
