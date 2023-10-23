package com.angelopicc.flicksfeed.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angelopicc.flicksfeed.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllPostsByUserId(long userId);
}
