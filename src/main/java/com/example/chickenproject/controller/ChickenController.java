package com.example.chickenproject.controller;

import com.example.chickenproject.dto.ChickenForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChickenController {
    @GetMapping("/chickens/new")
    public String newChickenForm() {
        return "chickens/new";
    }

    @PostMapping("/chickens/create")
    public String createChicken(ChickenForm form) {
        System.out.println(form.toString());
        return "";
    }
}
