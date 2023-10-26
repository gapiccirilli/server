package com.angelopicc.flicksfeed.services.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.entities.Comment;
import com.angelopicc.flicksfeed.entities.Post;
import com.angelopicc.flicksfeed.exceptions.CommentNotFoundException;
import com.angelopicc.flicksfeed.exceptions.PostNotFoundException;
import com.angelopicc.flicksfeed.payload.CommentDto;
import com.angelopicc.flicksfeed.repositories.CommentRepository;
import com.angelopicc.flicksfeed.repositories.PostRepository;
import com.angelopicc.flicksfeed.services.CommentService;

@Service
public class StandardCommentService implements CommentService {

    PostRepository postRepository;
    CommentRepository commentRepository;

    public StandardCommentService(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentDto createComment(CommentDto comment, long postId) {
        Post post = postRepository.findById(postId)
            .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + " can't be found"));

        Comment newComment = mapToEntity(comment);
        newComment.setPost(post);
        Comment savedComment = commentRepository.save(newComment);
        return mapToDto(savedComment);
    }

    @Override
    public CommentDto getCommentById(long commentId) {
        Comment comment = commentRepository.findById(commentId)
            .orElseThrow(() -> new CommentNotFoundException("Comment with id: " + commentId + " can't be found"));
        
        return mapToDto(comment);
    }

    @Override
    public List<CommentDto> getAllComments(long postId) {
        Post post = postRepository.findById(postId)
            .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + " can't be found"));
        List<Comment> comments = post.getComments();

        return comments.stream()
            .map(comment -> mapToDto(comment))
            .collect(Collectors.toList());
    }

    @Override
    public CommentDto updateComment(CommentDto newComment, long oldCommentId) {
        Comment comment = commentRepository.findById(oldCommentId)
            .orElseThrow(() -> new CommentNotFoundException("Comment with id: " + oldCommentId + " can't be found"));
        comment.setContent(newComment.getContent());
        Comment savedComment = commentRepository.save(comment);
        return mapToDto(savedComment);
    }

    @Override
    public void deleteComment(long commentId) {
        Comment comment = commentRepository.findById(commentId)
            .orElseThrow(() -> new CommentNotFoundException("Comment with id: " + commentId + " can't be found"));
        commentRepository.delete(comment);
    }

    // --------------------------------------------------------------------
    
    private static CommentDto mapToDto(Comment entity) {
        return new CommentDto(entity.getId(), entity.getContent());
    }

    private static Comment mapToEntity(CommentDto dto) {
        Comment comment = new Comment();
        comment.setId(dto.getId());
        comment.setContent(dto.getContent());

        return comment;
    }
}
