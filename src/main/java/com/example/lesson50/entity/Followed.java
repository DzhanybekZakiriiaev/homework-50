package com.example.lesson50.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Followed {
    private User user;
    private User follower;
    private LocalDateTime dateTime;
}
