package com.spring.data.jpa.repo;

import com.spring.data.jpa.entities.User;
import com.spring.data.jpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class UserRepo {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void repoTest1() {
        System.out.println("Testing repo");

        int i = userRepository.countByName("sandeep");
        System.out.println(i);

        System.out.println(userRepository.existsByEmail("targetit99@gmail.com"));

        List<User> list = userRepository.findByNameContaining("san");
        list.forEach(user -> {
            System.out.println(user.getName());
        });

//        Optional<User> byEmailOrderByNameAsc = userRepository.findByEmailOrderByNameAsc("targetit99@gmail.com");
//
//        User user = byEmailOrderByNameAsc.orElseThrow(() -> new RuntimeException("user not found"));
//        System.out.println(user.getUserId());
//
//        byEmailOrderByNameAsc.ifPresentOrElse(
//                user -> {
//                    System.out.println(user.getUserId());
//                    System.out.println(user.getName());
//                    System.out.println(user.getAge());
//                },
//                () -> System.out.println("User not found !!")
//        );
    }

    @Test
    public void repoTest2(){
//        List<User> india = userRepository.getUserByCountry("India");
//        System.out.println(india.size());

    }
}
