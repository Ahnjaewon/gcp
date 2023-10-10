package com.example.server.dto;

import com.example.server.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserResponse {

    private Long id;

    private String name;

    private String text;

    public UserResponse(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.text = member.getText();
    }
}
