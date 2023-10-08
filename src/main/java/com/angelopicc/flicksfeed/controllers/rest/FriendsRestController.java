package com.angelopicc.flicksfeed.controllers.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angelopicc.flicksfeed.payload.FriendDto;

@RestController
@RequestMapping("/api/friends")
public class FriendsRestController {
    
    @PostMapping
    public void addFriend(long userId) {

    }

    @GetMapping
    public List<FriendDto> getAllFriends() {
        return null;
    }

    @GetMapping("/requests")
    public List<FriendDto> getAllFriendRequests() {
        return null;
    }

    @GetMapping("/pending")
    public List<FriendDto> getAllPendingRequests() {
        return null;
    }

    @PostMapping("/{friendId}")
    public void acceptFriendRequest(long friendId) {

    }

    @DeleteMapping("/requests/{friendId}")
    public void denyFriendRequest(long friendId) {

    }

    @DeleteMapping("/{friendId}")
    public void removeFriend(long friendId) {

    }

}
