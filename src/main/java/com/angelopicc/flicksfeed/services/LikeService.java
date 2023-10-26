package com.angelopicc.flicksfeed.services;

import java.util.List;

import com.angelopicc.flicksfeed.payload.LikeDto;

public interface LikeService {
    
    void like(LikeDto like);
    void unlike(long likeId);
    List<LikeDto> getAllLikes(long postId);
}
