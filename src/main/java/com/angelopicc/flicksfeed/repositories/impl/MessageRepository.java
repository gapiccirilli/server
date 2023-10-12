package com.angelopicc.flicksfeed.repositories.impl;

import java.util.List;

import com.angelopicc.flicksfeed.entities.Message;
import com.angelopicc.flicksfeed.repositories.Repository;

public class MessageRepository implements Repository <Message, Long> {

    @Override
    public Message save(Message entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Message findById(Long identifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Message> findAll(Long identifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public List<Message> search(String query) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public Message update(Message entity, Long identifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("update is unsupported for 'Message' entity");
    }

    @Override
    public void delete(Long identifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
