package com.example.greetingapplication.service;

import com.example.greetingapplication.dto.User;
import com.example.greetingapplication.model.GreetingModel;
import com.example.greetingapplication.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingService implements IGreettingService {
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Object addGreeting(User user) {
        String message = String.format("Hello, %s!", (user.toString().isEmpty()) ? "Hello World" : user.toString());
        return greetingRepository.save(new GreetingModel(counter.incrementAndGet(), message));
    }
}
