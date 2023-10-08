package com.angelopicc.flicksfeed.controllers.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angelopicc.flicksfeed.payload.ConversationDto;

@RestController
@RequestMapping("/api/posts/{postId}/conversations")
public class ConversationRestController {
    
    @PostMapping
    public void logConversation(@RequestBody ConversationDto conversation, @PathVariable long postId) {

    }

    @GetMapping("/{conversationId}")
    public ConversationDto getConversationById(@PathVariable long conversationId) {
        return null;
    }

    @GetMapping
    public List<ConversationDto> getAllConversations(@PathVariable long postId) {
        return null;
    }

    @DeleteMapping("/{conversationId}")
    public void deleteConversation(@PathVariable long conversationId) {

    }

}
