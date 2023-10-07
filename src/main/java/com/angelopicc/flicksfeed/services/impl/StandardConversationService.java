package com.angelopicc.flicksfeed.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.payload.ConversationDto;
import com.angelopicc.flicksfeed.services.ConversationService;

@Service
public class StandardConversationService implements ConversationService {

    @Override
    public void logConversation(ConversationDto conversation, long postId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logConversation'");
    }

    @Override
    public ConversationDto getConversationById(long conversationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getConversationById'");
    }

    @Override
    public List<ConversationDto> getAllConversations(long postId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllConversations'");
    }

    @Override
    public void deleteConversation(long conversationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteConversation'");
    }
    
}
