package com.example.lesson50.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private String text;
    private LocalDateTime dateTime;
}
