package com.blz.greetingapplication.repository;

import com.blz.greetingapplication.model.GreetingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingModel, Long> {
}
