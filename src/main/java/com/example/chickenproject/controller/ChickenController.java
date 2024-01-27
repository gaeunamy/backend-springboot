package com.example.chickenproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChickenController {
    @GetMapping("/articles/new")
    public String newChickenForm() {
        return "articles/new";
    }
}
