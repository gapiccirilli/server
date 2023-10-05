package com.angelopicc.flicksfeed.services;

import java.util.List;

import com.angelopicc.flicksfeed.payload.CommentDto;

public interface CommentService {
    
    CommentDto createComment(CommentDto comment, long postId);
    CommentDto getCommentById(long commentId);
    List<CommentDto> getAllComments(long postId);
    CommentDto updateComment(CommentDto newComment, long oldCommentId);
    void deleteComment(long commentId);
}
