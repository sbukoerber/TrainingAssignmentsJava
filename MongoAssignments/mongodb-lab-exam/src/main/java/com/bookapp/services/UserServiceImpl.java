package com.bookapp.services;

import com.bookapp.entities.User;
import com.bookapp.exceptions.UserNotFoundException;
import com.bookapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepo userRepo;

    @Autowired
    private UserServiceImpl (UserRepo userRepo){
        this.userRepo= userRepo;
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public User update(String id, User user) {
        user.setId(id);
        userRepo.save(user);

        return user;
    }

    @Override
    public void delete(String id) {
        userRepo.deleteById(id);

    }

    @Override
    public User getById(String id) {
        return userRepo.findById(id).orElseThrow(()->
                new UserNotFoundException("User not found"));
    }
}
