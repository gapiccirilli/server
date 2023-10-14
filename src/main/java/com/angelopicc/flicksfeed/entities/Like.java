package com.angelopicc.flicksfeed.entities;

import org.springframework.data.annotation.Id;

// @Entity
public class Like {
    
    @Id
    private long id;
    private long userId;
    private Post post;
    
    public Like() {
    }

    public Like(long id, long userId, Post post) {
        this.id = id;
        this.userId = userId;
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Like [id=" + id + ", userId=" + userId + ", post=" + post + "]";
    }
}
