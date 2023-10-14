package com.angelopicc.flicksfeed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angelopicc.flicksfeed.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
