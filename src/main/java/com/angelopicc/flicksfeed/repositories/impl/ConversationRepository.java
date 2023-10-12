package com.angelopicc.flicksfeed.repositories.impl;

import java.util.List;

import com.angelopicc.flicksfeed.entities.Conversation;
import com.angelopicc.flicksfeed.repositories.Repository;

public class ConversationRepository implements Repository <Conversation, Long> {

    @Override
    public Conversation save(Conversation entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Conversation findById(Long identifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Conversation> findAll(Long identifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public List<Conversation> search(String query) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public Conversation update(Conversation entity, Long identifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("update is unsupported for 'Conversation' entity");
    }

    @Override
    public void delete(Long identifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
