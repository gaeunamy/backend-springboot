package com.example.firstproject.api;

import com.example.firstproject.dto.CoffeeDto;
import com.example.firstproject.entity.Coffee;
import com.example.firstproject.service.CoffeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class CoffeeApiController {
    @Autowired
    private CoffeeService coffeeService;

    // GET
    // 모든 게시글 조회
    @GetMapping("/api/coffees")
    public List<Coffee> index() {
        return coffeeService.index();
    }

    // 단일 게시글 조회
    @GetMapping("/api/coffees/{id}")
    public Coffee show(@PathVariable Long id) {
        return coffeeService.show(id);
    }

    // POST
    @PostMapping("/api/coffees")
    public ResponseEntity<Coffee> create(@RequestBody CoffeeDto dto) {
        Coffee created = coffeeService.create(dto);
        return (created != null) ?
                ResponseEntity.status(HttpStatus.OK).body(created) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    // PATCH
    @PatchMapping("/api/coffees/{id}")
    public ResponseEntity<Coffee> update(@PathVariable Long id, @RequestBody CoffeeDto dto) {
        Coffee updated = coffeeService.update(id, dto);
        return (updated != null) ?
                ResponseEntity.status(HttpStatus.OK).body(updated) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    // DELETE
    @DeleteMapping("/api/coffees/{id}")
    public ResponseEntity<Coffee> delete(@PathVariable Long id) {
        Coffee deleted = coffeeService.delete(id);
        return (deleted != null) ?
                ResponseEntity.status(HttpStatus.NO_CONTENT).build() :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
/*
    @PostMapping("/api/transaction-test-coffee")
    public ResponseEntity<List<Coffee>> transactionTest(@RequestBody List<CoffeeDto> dtos) {
        List<Coffee> createdList = coffeeService.createCoffees(dtos);
        return (createdList != null) ?
                ResponseEntity.status(HttpStatus.OK).body(createdList) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    */
}
