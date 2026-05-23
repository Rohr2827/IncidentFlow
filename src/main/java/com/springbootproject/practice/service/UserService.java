package com.springbootproject.practice.service;

import com.springbootproject.practice.dto.CreateUserRequest;
import com.springbootproject.practice.dto.UserResponse;
import com.springbootproject.practice.entity.User;
import com.springbootproject.practice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
public class UserService 
{

    private final UserRepository userRepository;

    public UserResponse createUser(CreateUserRequest request)
    {
        User user = User.builder()
            .username(request.getUsername())
            .email(request.getEmail())
            .password(request.getPassword())
            .role("USER")
            .createdAt(LocalDateTime.now())
            .build();

        User savedUser = userRepository.save(user);

        return UserResponse.builder()
            .id(savedUser.getId())
            .username(savedUser.getUsername())
            .email(savedUser.getEmail())
            .role(savedUser.getRole())
            .build();
    }
    
}
