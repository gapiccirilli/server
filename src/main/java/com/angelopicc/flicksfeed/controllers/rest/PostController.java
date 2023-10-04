package com.angelopicc.flicksfeed.controllers.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PostController {

    @GetMapping
    public String getTest() {
        return "This is a test";
    }
}
