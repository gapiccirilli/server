package com.angelopicc.flicksfeed.repositories;

import java.util.List;

public interface Repository<E,PK> {
    
    E save(E entity);
    E findById(PK identifier);
    List<E> findAll(PK identifier);
    List<E> search(String query);
    E update(E entity, PK identifier);
    void delete(PK identifier);
}
