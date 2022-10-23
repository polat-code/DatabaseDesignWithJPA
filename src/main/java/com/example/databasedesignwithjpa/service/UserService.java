package com.example.databasedesignwithjpa.service;

import com.example.databasedesignwithjpa.model.Country;
import com.example.databasedesignwithjpa.model.User;
import com.example.databasedesignwithjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user) {
           return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
