package com.angelopicc.flicksfeed.services;

import java.util.List;

import com.angelopicc.flicksfeed.payload.FriendDto;

public interface FriendService {
    
    void addFriend(long userId);
    List<FriendDto> getAllFriends();
    List<FriendDto> getAllFriendRequests();
    List<FriendDto> getAllPendingRequests();
    void acceptFriendRequest(long friendId);
    void denyFriendRequest(long friendId);
    void removeFriend(long friendId);
}
