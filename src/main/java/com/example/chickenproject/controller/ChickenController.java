package com.example.chickenproject.controller;

import com.example.chickenproject.dto.ChickenForm;
import com.example.chickenproject.entity.Chicken;
import com.example.chickenproject.repository.ChickenRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ChickenController {
    @Autowired
    private ChickenRepository chickenRepository;

    @GetMapping("/chickens/new")
    public String newChickenForm() {
        return "chickens/new";
    }

    @PostMapping("/chickens/create")
    public String createChicken(ChickenForm form) {
        log.info(form.toString());
        // System.out.println(form.toString());
        // 1. DTO를 엔티티로 변환
        Chicken chicken = form.toEntity();
        log.info(chicken.toString());
        // System.out.println(chicken.toString());
        // 2. 리파지터리로 엔티티를 DB에 저장
        Chicken saved = chickenRepository.save(chicken);
        log.info(saved.toString());
        // System.out.println(saved.toString());
        return "";
    }
}
