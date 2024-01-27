package com.example.chickenproject.repository;

import com.example.chickenproject.entity.Chicken;
import org.springframework.data.repository.CrudRepository;

public interface ChickenRepository extends CrudRepository<Chicken, Long> {
}
