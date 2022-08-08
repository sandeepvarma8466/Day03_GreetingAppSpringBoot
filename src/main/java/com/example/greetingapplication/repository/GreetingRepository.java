package com.example.greetingapplication.repository;

import com.example.greetingapplication.model.GreetingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingModel, Long> {
}
