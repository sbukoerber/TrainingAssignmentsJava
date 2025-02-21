package com.bookapp.services;

import com.bookapp.entities.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public User save(User user);
    public User update(String id, User user);
    public void delete(String id);
    public User getById(String id);
}
