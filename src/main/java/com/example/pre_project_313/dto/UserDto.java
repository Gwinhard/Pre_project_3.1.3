package com.example.pre_project_313.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {

    private Long id;

    private String name;

    private String lastName;

    private String age;

    private String email;

    private String password;

    private String[] roles;

}
