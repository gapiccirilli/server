package com.angelopicc.flicksfeed.services;

import java.util.List;

import com.angelopicc.flicksfeed.payload.LikeDto;

public interface LikeService {
    
    void like(long userId, long postId);
    void unlike(long userId, long postId);
    List<LikeDto> getAllLikes(long postId);
}
