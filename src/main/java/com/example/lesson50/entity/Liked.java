package com.example.lesson50.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Liked {
    private User user;
    private Post post;
    private LocalDateTime dateTime;
}
