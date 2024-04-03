package com.vahner.airticketsapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserCreateDTO {
    private String username;
    private String password;
    private String email;
}
