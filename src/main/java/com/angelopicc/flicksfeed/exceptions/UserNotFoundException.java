package com.angelopicc.flicksfeed.exceptions;

public class UserNotFoundException extends RuntimeException {
    
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
