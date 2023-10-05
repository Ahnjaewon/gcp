package com.example.server.dto;

import com.example.server.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserResponse {

    private Long id;

    private String name;

    private String text;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.text = user.getText();
    }
}
