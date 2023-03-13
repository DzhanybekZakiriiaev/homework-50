package com.example.lesson50.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {
    private String image;
    private String description;
    private LocalDateTime dateTime;
}
