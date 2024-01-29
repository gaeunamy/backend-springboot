package com.example.chickenproject.dto;

import com.example.chickenproject.entity.Chicken;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ChickenForm {
    private String title;
    private String content;

    public Chicken toEntity() {
        return new Chicken(null, title, content);
    }
}
