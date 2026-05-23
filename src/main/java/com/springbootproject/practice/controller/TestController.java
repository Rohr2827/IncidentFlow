package com.springbootproject.practice.controller;

import com.springbootproject.practice.entity.User;
import com.springbootproject.practice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {

    private final UserRepository userRepository;

    @PostMapping
    public User createUser() {

        User user = User.builder()
                .username("jr")
                .email("jr@test.com")
                .password("password")
                .role("ADMIN")
                .createdAt(LocalDateTime.now())
                .build();

        return userRepository.save(user);
    }
}