package com.angelopicc.flicksfeed.services;

import java.util.List;

import com.angelopicc.flicksfeed.payload.ConversationDto;

public interface ConversationService {
    
    void logConversation(ConversationDto conversation, long postId);
    ConversationDto getConversationById(long conversationId);
    List<ConversationDto> getAllConversations(long postId);
    void deleteConversation(long conversationId);
}
