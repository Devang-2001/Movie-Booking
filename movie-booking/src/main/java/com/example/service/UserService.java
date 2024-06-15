package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moviebooking.User;
import com.example.repository.*;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Encrypt password and save user
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {
        // Authenticate user
        return userRepository.findByEmail(email)
            .filter(user -> user.getPassword().equals(password))
            .orElse(null);
    }
}
