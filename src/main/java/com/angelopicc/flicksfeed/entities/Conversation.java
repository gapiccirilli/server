package com.angelopicc.flicksfeed.entities;

import java.util.List;

// @Entity
public class Conversation {

    private long id;
    private List<Message> messages;
    private Post post;
    
    public Conversation() {
    }

    public Conversation(long id, List<Message> messages, Post post) {
        this.id = id;
        this.messages = messages;
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Conversation [id=" + id + ", messages=" + messages + ", post=" + post + "]";
    }
}
