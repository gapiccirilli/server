package com.angelopicc.flicksfeed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angelopicc.flicksfeed.entities.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    
}
