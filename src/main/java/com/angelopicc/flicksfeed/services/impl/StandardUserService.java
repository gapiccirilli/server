package com.angelopicc.flicksfeed.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.angelopicc.flicksfeed.payload.UserDto;
import com.angelopicc.flicksfeed.services.UserService;

@Service
public class StandardUserService implements UserService {

    @Override
    public UserDto registerUser(UserDto user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerUser'");
    }

    @Override
    public UserDto getUserById(long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public List<UserDto> getAllUsersBySearch(String query) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsersBySearch'");
    }

    @Override
    public UserDto updateUser(UserDto newUser, long oldUserId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }
    
}
