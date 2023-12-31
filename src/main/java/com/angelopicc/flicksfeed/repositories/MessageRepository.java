package com.angelopicc.flicksfeed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angelopicc.flicksfeed.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    
}
