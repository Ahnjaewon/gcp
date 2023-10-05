package com.example.server.service;

import com.example.server.entity.User;
import com.example.server.repository.UserRepository;
import com.example.server.dto.UserRequest;
import com.example.server.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public List<UserResponse> userList() {
        List<User> userList = userRepository.findAll();
        return userList.stream()
                .map(UserResponse::new)
                .toList();
    }

    public void insertUser(UserRequest userRequest) {
        userRepository.save(userRequest.toEntity());
    }
}
