package com.angelopicc.flicksfeed.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User sender;
    private User receiver;
    private LocalDateTime requestSent;
    private LocalDateTime requestAccepted;
    private LocalDateTime requestDenied;
    
    public Friend() {
    }

    public Friend(long id, User sender, User receiver, LocalDateTime requestSent, LocalDateTime requestAccepted,
            LocalDateTime requestDenied) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.requestSent = requestSent;
        this.requestAccepted = requestAccepted;
        this.requestDenied = requestDenied;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public LocalDateTime getRequestSent() {
        return requestSent;
    }

    public void setRequestSent(LocalDateTime requestSent) {
        this.requestSent = requestSent;
    }

    public LocalDateTime getRequestAccepted() {
        return requestAccepted;
    }

    public void setRequestAccepted(LocalDateTime requestAccepted) {
        this.requestAccepted = requestAccepted;
    }

    public LocalDateTime getRequestDenied() {
        return requestDenied;
    }

    public void setRequestDenied(LocalDateTime requestDenied) {
        this.requestDenied = requestDenied;
    }

    @Override
    public String toString() {
        return "Friend [id=" + id + ", sender=" + sender + ", receiver=" + receiver + ", requestSent=" + requestSent
                + ", requestAccepted=" + requestAccepted + ", requestDenied=" + requestDenied + "]";
    }
}
