package com.example.greetingapplication.controller;

import com.example.greetingapplication.dto.User;
import com.example.greetingapplication.service.IGreettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    IGreettingService greettingService;

    @GetMapping(" ")
    public Object greeting(@RequestParam(value = "firstName", defaultValue = "World") String firstName) {
        User user = new User();
        user.setFirstName(firstName);
        System.out.println(user);
        return greettingService.addGreeting(user);
    }
}
