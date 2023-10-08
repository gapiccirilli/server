package com.angelopicc.flicksfeed.controllers.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angelopicc.flicksfeed.payload.CommentDto;

@RestController
@RequestMapping("/api/posts/{postId}/comments")
public class CommentRestController {
    
    @PostMapping
    public CommentDto createComment(@RequestBody CommentDto comment, @PathVariable long postId) {
        return null;
    }

    @GetMapping("/{commentId}")
    public CommentDto getCommentById(@PathVariable long commentId) {
        return null;
    }

    @GetMapping
    public List<CommentDto> getAllComments(@PathVariable long postId) {
        return null;
    }

    @PutMapping("/{commentId}")
    public CommentDto updateComment(@RequestBody CommentDto newComment, @PathVariable long oldCommentId) {
        return null;
    }

    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable long commentId) {

    }

}
