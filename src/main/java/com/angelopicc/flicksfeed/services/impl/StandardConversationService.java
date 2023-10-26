package com.angelopicc.flicksfeed.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.entities.Conversation;
import com.angelopicc.flicksfeed.entities.Post;
import com.angelopicc.flicksfeed.exceptions.ConversationNotFoundException;
import com.angelopicc.flicksfeed.exceptions.PostNotFoundException;
import com.angelopicc.flicksfeed.payload.ConversationDto;
import com.angelopicc.flicksfeed.repositories.ConversationRepository;
import com.angelopicc.flicksfeed.repositories.PostRepository;
import com.angelopicc.flicksfeed.services.ConversationService;

@Service
public class StandardConversationService implements ConversationService {

    ConversationRepository conversationRepository;
    PostRepository postRepository;

    public StandardConversationService(ConversationRepository conversationRepository, PostRepository postRepository) {
        this.conversationRepository = conversationRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void logConversation(ConversationDto conversation, long postId) {
        Post post = postRepository.findById(postId)
            .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + " can't be found"));
        Conversation newConversation = mapToEntity(conversation);
        newConversation.setPost(post);
    }

    @Override
    public ConversationDto getConversationById(long conversationId) {
       Conversation conversation = conversationRepository.findById(conversationId)
            .orElseThrow(() -> new ConversationNotFoundException("Conversation with id: " + conversationId + "can't be found"));
        return mapToDto(conversation);
    }

    @Override
    public List<ConversationDto> getAllConversations(long postId) {
        List<Conversation> conversations = postRepository.findById(postId)
                .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + " can't be found"))
                .getConversations();
        
        
        List<ConversationDto> dtos = new ArrayList<>(conversations.size());

        for (Conversation conversation : conversations) {
            dtos.add(mapToDto(conversation));
        }

        return dtos;
    }

    @Override
    public void deleteConversation(long conversationId) {
        boolean conversationExists = conversationRepository.existsById(conversationId);

        if (conversationExists) {
            conversationRepository.deleteById(conversationId);
        } else {
            throw new ConversationNotFoundException("Conversation with id: " + conversationId + "can't be found");
        }
        
    }

    private static ConversationDto mapToDto(Conversation entity) {
        ConversationDto dto = new ConversationDto(entity.getId());
        return dto;
    }

    private static Conversation mapToEntity(ConversationDto dto) {
        Conversation entity = new Conversation();
        entity.setId(dto.getId());
        return entity;
    }
    
}
