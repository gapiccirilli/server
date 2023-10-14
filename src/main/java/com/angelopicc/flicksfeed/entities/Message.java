package com.angelopicc.flicksfeed.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String message;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
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
