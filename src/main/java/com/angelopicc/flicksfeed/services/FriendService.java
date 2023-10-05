package com.angelopicc.flicksfeed.services;

public interface FriendService {
    
    void addFriend(long userId);
    void acceptFriendRequest(long friendId);
    void denyFriendRequest(long friendId);
    void removeFriend(long friendId);
}
