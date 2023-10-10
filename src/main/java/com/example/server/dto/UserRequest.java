package com.example.server.dto;

import com.example.server.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequest {

    private String name;

    private String text;

    public Member toEntity(){
        return Member.builder()
                .name(name)
                .text(text)
                .build();
    }
}
