package com.angelopicc.flicksfeed.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.payload.FriendDto;
import com.angelopicc.flicksfeed.services.FriendService;

@Service
public class StandardFriendService implements FriendService {

    @Override
    public void addFriend(long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addFriend'");
    }
    
    @Override
    public List<FriendDto> getAllFriends() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllFriends'");
    }

    @Override
    public List<FriendDto> getAllFriendRequests() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllFriendRequests'");
    }

    @Override
    public List<FriendDto> getAllPendingRequests() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPendingRequests'");
    }

    @Override
    public void acceptFriendRequest(long friendId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acceptFriendRequest'");
    }

    @Override
    public void denyFriendRequest(long friendId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'denyFriendRequest'");
    }

    @Override
    public void removeFriend(long friendId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFriend'");
    }
}
