package com.angelopicc.flicksfeed.controllers.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angelopicc.flicksfeed.payload.PostDto;

@RestController
@RequestMapping("/api/posts")
public class PostRestController {

    @PostMapping
    public PostDto createPost(@RequestBody PostDto postDto) {
        return null;
    }

    @GetMapping("/{postId}")
    public PostDto getPostById(@PathVariable long postId) {
        return null;
    }

    @GetMapping("/users/{userId}")
    public List<PostDto> getAllPosts(@PathVariable long userId) {
        return null;
    }

    @GetMapping
    public List<PostDto> getPostsBySearch(@RequestParam String query) {
        return null;
    }

    @PutMapping("/{oldPostId}")
    public PostDto updatePost(@RequestBody PostDto newPost, @PathVariable long oldPostId) {
        return null;
    }

    @DeleteMapping("/{postId}")
    public void deletePost(long postId) {
        
    }
}
