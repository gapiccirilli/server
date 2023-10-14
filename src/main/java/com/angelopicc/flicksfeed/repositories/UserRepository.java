package com.angelopicc.flicksfeed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angelopicc.flicksfeed.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
