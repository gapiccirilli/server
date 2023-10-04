package com.angelopicc.flicksfeed.entities;

import jakarta.persistence.Entity;

@Entity
public class Friend {
    private long id;
    private User user;
    private long friendUserId;
    
    public Friend() {
    }

    public Friend(long id, User user, long friendUserId) {
        this.id = id;
        this.user = user;
        this.friendUserId = friendUserId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getFriendUserId() {
        return friendUserId;
    }

    public void setFriendUserId(long friendUserId) {
        this.friendUserId = friendUserId;
    }

    @Override
    public String toString() {
        return "Friend [id=" + id + ", user=" + user + ", friendUserId=" + friendUserId + "]";
    }
}
