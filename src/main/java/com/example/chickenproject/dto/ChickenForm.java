package com.example.chickenproject.dto;

public class ChickenForm {
    private String title;
    private String content;

    public ChickenForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ChickenForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
