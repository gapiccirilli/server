package com.angelopicc.flicksfeed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angelopicc.flicksfeed.entities.Conversation;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Long> {
    
}
