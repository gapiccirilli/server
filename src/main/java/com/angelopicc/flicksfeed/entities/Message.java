package com.angelopicc.flicksfeed.entities;

import jakarta.persistence.Entity;

// @Entity
public class Message {

    private long id;
    private String message;
    private Conversation conversation;

    public Message() {

    }

    public Message(long id, String message, Conversation conversation) {
        this.id = id;
        this.message = message;
        this.conversation = conversation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    @Override
    public String toString() {
        return "Message [id=" + id + ", message=" + message + ", conversation=" + conversation + "]";
    }
}
