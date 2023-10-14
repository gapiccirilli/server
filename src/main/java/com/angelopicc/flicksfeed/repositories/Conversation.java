package com.angelopicc.flicksfeed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Conversation extends JpaRepository<Conversation, Long> {
    
}
