package com.blz.greetingapplication.service;

import com.blz.greetingapplication.dto.GreetingDTO;
import com.blz.greetingapplication.model.GreetingModel;
import com.blz.greetingapplication.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGrettingService{
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private GreetingRepository greetingRepository;
    @Override
    public GreetingModel addGreeting(GreetingDTO greetingDTO) {
        String message = String.format("Hello",(greetingDTO.toString().isEmpty()) ? "Hello world" : greetingDTO.toString());
        return greetingRepository.save(new GreetingModel(counter.incrementAndGet(),message));
    }
}
