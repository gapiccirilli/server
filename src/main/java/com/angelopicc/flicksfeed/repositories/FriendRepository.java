package com.angelopicc.flicksfeed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angelopicc.flicksfeed.entities.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {
    
}
