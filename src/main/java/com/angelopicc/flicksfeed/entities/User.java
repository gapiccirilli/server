package com.angelopicc.flicksfeed.entities;

import java.util.List;

import jakarta.persistence.Entity;

// @Entity
public class User {
    private long id;
    private String username;
    private String email;
    private String password;
    private String profileImage;
    private List<Friend> friends;
    private List<Friend> sentRequests;
    private List<Friend> receivedRequests;
}
