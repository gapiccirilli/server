package com.angelopicc.flicksfeed.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.payload.MessageDto;
import com.angelopicc.flicksfeed.services.MessageService;

@Service
public class StandardMessageService implements MessageService {

    @Override
    public void logMessage(MessageDto message, long conversationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logMessage'");
    }

    @Override
    public MessageDto getMessageById(long messageId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMessageById'");
    }

    @Override
    public List<MessageDto> getAllMessages(long conversationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMessages'");
    }

    @Override
    public void deleteMessage(long messageId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteMessage'");
    }
    
}
