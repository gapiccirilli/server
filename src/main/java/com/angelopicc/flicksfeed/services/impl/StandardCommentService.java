package com.angelopicc.flicksfeed.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.payload.CommentDto;
import com.angelopicc.flicksfeed.services.CommentService;

@Service
public class StandardCommentService implements CommentService {

    @Override
    public CommentDto createComment(CommentDto comment, long postId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createComment'");
    }

    @Override
    public CommentDto getCommentById(long commentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCommentById'");
    }

    @Override
    public List<CommentDto> getAllComments(long postId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllComments'");
    }

    @Override
    public CommentDto updateComment(CommentDto newComment, long oldCommentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateComment'");
    }

    @Override
    public void deleteComment(long commentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteComment'");
    }
    
}
