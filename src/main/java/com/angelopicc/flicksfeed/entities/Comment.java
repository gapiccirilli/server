package com.angelopicc.flicksfeed.entities;

import org.springframework.data.annotation.Id;

// @Entity
public class Comment {

    @Id
    private long id;
    private String content;
    private Post post;
    
    public Comment() {
    }

    public Comment(long id, String content, Post post) {
        this.id = id;
        this.content = content;
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Comment [id=" + id + ", content=" + content + ", post=" + post + "]";
    }    
}
