package com.angelopicc.flicksfeed.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.entities.Conversation;
import com.angelopicc.flicksfeed.entities.Message;
import com.angelopicc.flicksfeed.exceptions.ConversationNotFoundException;
import com.angelopicc.flicksfeed.exceptions.MessageNotFoundException;
import com.angelopicc.flicksfeed.payload.MessageDto;
import com.angelopicc.flicksfeed.repositories.ConversationRepository;
import com.angelopicc.flicksfeed.repositories.MessageRepository;
import com.angelopicc.flicksfeed.services.MessageService;

@Service
public class StandardMessageService implements MessageService {

    private MessageRepository messageRepository;
    private ConversationRepository conversationRepository;

    public StandardMessageService(MessageRepository messageRepository, ConversationRepository conversationRepository) {
        this.messageRepository = messageRepository;
        this.conversationRepository = conversationRepository;
    }

    @Override
    public void logMessage(MessageDto message, long conversationId) {
        Conversation conversation = conversationRepository.findById(conversationId)
                .orElseThrow(() -> new ConversationNotFoundException("Conversation with id: " + conversationId + " can't be found"));
        Message newMessage = mapToEntity(message);
        newMessage.setConversation(conversation);

        messageRepository.save(newMessage);
    }

    @Override
    public MessageDto getMessageById(long messageId) {
        Message message = messageRepository.findById(messageId)
                .orElseThrow(() -> new MessageNotFoundException("Message with id: " + messageId + " can't be found"));
        return mapToDto(message);
    }

    @Override
    public List<MessageDto> getAllMessages(long conversationId) {
        Conversation conversation = conversationRepository.findById(conversationId)
                .orElseThrow(() -> new ConversationNotFoundException("Conversation with id: " + conversationId + " can't be found"));
        List<Message> messages = conversation.getMessages();

        List<MessageDto> dtos = messages.stream()
            .map(message -> mapToDto(message))
            .collect(Collectors.toList());

        return dtos;
    }

    @Override
    public void deleteMessage(long messageId) {
        boolean messageExists = messageRepository.existsById(messageId);

        if(messageExists) {
            messageRepository.deleteById(messageId);
        }
    }

    private static Message mapToEntity(MessageDto dto) {
        Message message = new Message();
        message.setId(dto.getId());
        message.setMessage(dto.getMessage());
        return message;
    }

    private static MessageDto mapToDto(Message entity) {
        return new MessageDto(entity.getId(), entity.getMessage());
    }
}
