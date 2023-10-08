package com.angelopicc.flicksfeed.controllers.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angelopicc.flicksfeed.payload.MessageDto;

@RestController
@RequestMapping("/api/conversations/{conversationId}/messages")
public class MessageRestController {
    
    @PostMapping
    public void logMessage(MessageDto message, long conversationId) {

    }

    @GetMapping("/{messageId}")
    public MessageDto getMessageById(long messageId) {
        return null;
    }

    @GetMapping
    public List<MessageDto> getAllMessages(long conversationId) {
        return null;
    }

    @DeleteMapping("/{messageId}")
    public void deleteMessage(long messageId) {

    }

}
