package com.angelopicc.flicksfeed.controllers.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angelopicc.flicksfeed.payload.LikeDto;

@RestController
@RequestMapping("/api/posts/likes")
public class LikeRestController {
    
    @PostMapping("/{userId}/{postId}")
    public void like(@PathVariable long userId, @PathVariable long postId) {

    }

    @DeleteMapping("/{userId}/{postId}")
    public void unlike(@PathVariable long userId, @PathVariable long postId) {

    }

    @GetMapping("/{postId}")
    public List<LikeDto> getAllLikes(@PathVariable long postId) {
        return null;
    }

}
