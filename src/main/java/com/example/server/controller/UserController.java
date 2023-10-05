package com.example.server.controller;


import com.example.server.dto.UserRequest;
import com.example.server.dto.UserResponse;
import com.example.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponse> userList(){
        return userService.userList();
    }

    @PostMapping
    public void insertUser(@RequestBody UserRequest userRequest){
        userService.insertUser(userRequest);
    }
}
