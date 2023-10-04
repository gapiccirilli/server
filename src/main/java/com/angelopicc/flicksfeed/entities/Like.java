package com.angelopicc.flicksfeed.entities;

import jakarta.persistence.Entity;

@Entity
public class Like {
    
    private long id;
    private boolean isLiked;
    private long userId;
    private Post post;
    
    public Like() {
    }

    public Like(long id, boolean isLiked, long userId, Post post) {
        this.id = id;
        this.isLiked = isLiked;
        this.userId = userId;
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean isLiked) {
        this.isLiked = isLiked;
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
        return "Like [id=" + id + ", isLiked=" + isLiked + ", userId=" + userId + ", post=" + post + "]";
    }
}
