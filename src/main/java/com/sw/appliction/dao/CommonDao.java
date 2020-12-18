package com.sw.appliction.dao;

import java.util.Collection;

public interface CommonDao<T> {

    T getById(long id) throws Exception;
    Collection<T> getAll();
    void save(T t);
    void update(T t);
    void delete(T t);
}
