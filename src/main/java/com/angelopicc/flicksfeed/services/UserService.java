package com.angelopicc.flicksfeed.services;

import java.util.List;

import com.angelopicc.flicksfeed.payload.UserDto;

public interface UserService {
    
    UserDto registerUser(UserDto user);
    UserDto getUserById(long userId);
    List<UserDto> getAllUsersBySearch(String query);
    UserDto updateUser(UserDto newUser, long oldUserId);
    void deleteUser(long userId);
}
