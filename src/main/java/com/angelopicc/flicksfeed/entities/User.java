package com.angelopicc.flicksfeed.entities;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String email;
    private String password;
    private String profileImage;

    @OneToMany(mappedBy = "sender")
    private List<Friend> friends;

    @Transient
    private List<Friend> sentRequests;

    @Transient
    private List<Friend> receivedRequests;
    
    public User() {
    }

    public User(long id, String username, String email, String password, String profileImage, List<Friend> friends,
            List<Friend> sentRequests, List<Friend> receivedRequests) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.profileImage = profileImage;
        this.friends = friends;
        this.sentRequests = sentRequests;
        this.receivedRequests = receivedRequests;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public List<Friend> getSentRequests() {
        return sentRequests;
    }

    public void setSentRequests(List<Friend> sentRequests) {
        this.sentRequests = sentRequests;
    }

    public List<Friend> getReceivedRequests() {
        return receivedRequests;
    }

    public void setReceivedRequests(List<Friend> receivedRequests) {
        this.receivedRequests = receivedRequests;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
                + ", profileImage=" + profileImage + ", friends=" + friends + ", sentRequests=" + sentRequests
                + ", receivedRequests=" + receivedRequests + "]";
    }
}
