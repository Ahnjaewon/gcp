package com.example.server.dto;

import com.example.server.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequest {

    private String name;

    private String text;

    public User toEntity(){
        return User.builder()
                .name(name)
                .text(text)
                .build();
    }
}
