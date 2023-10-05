package com.angelopicc.flicksfeed.services;

import java.util.List;

import com.angelopicc.flicksfeed.payload.MessageDto;

public interface MessageService {
    
    void logMessage(MessageDto message, long conversationId);
    MessageDto getMessageById(long messageId);
    List<MessageDto> getAllMessages(long conversationId);
    void deleteMessage(long messageId);
}
