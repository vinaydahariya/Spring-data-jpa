package com.spring.data.jpa.service;

import com.spring.data.jpa.entities.User;
import com.spring.data.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //  save user :
    public User save(User user){
        return userRepository.save(user);
    }

    // get user :
    public User get(int userId){
        return userRepository.findById(userId)
                .orElseThrow(()-> new RuntimeException("user not found"));
    }

}
