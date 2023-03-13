package com.example.lesson50.entity;

import lombok.Data;

@Data
public class User {
    private String name;
    private String email;
    private String password;
    private int posts;
    private int followed;
    private int followers;
}
