package com.example.server.service;

import com.example.server.entity.Member;
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
        List<Member> memberList = userRepository.findAll();
        return memberList.stream()
                .map(UserResponse::new)
                .toList();
    }

    public void insertUser(UserRequest userRequest) {
        userRepository.save(userRequest.toEntity());
    }
}
