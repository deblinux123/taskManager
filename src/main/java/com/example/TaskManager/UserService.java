package com.example.TaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService 
{
    @Autowired
    private UserRepository userRepository;
    
    public boolean registerUser(User user)
    {
        if (userRepository.findByUsername(user.getUsername()).isPresent())
        {
            return false;
        }

        userRepository.save(user);
        return true;
    }

    public User login(String username, String password) {
        return userRepository.findByUsername(username)
                .filter(u -> u.getPassword().equals(password))
                .orElse(null);
    }

}
