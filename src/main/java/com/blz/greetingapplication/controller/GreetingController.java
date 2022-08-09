package com.blz.greetingapplication.controller;

import com.blz.greetingapplication.dto.GreetingDTO;
import com.blz.greetingapplication.model.GreetingModel;
import com.blz.greetingapplication.service.IGrettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    IGrettingService grettingService;

    @GetMapping("/getdata")
    public GreetingModel greeting(@RequestParam(value = "firstName", defaultValue = "World") String firstName) {
        GreetingDTO greetingDTO = new GreetingDTO();
        greetingDTO.setFirstName(firstName);
        System.out.println(greetingDTO);
        return grettingService.addGreeting(greetingDTO);
    }

    @GetMapping("/path/{id}")
    public Optional<GreetingModel> getMessageById(@PathVariable(value = "id") long id) {
        return Optional.ofNullable(grettingService.getGreetingById(id));
    }

    @GetMapping("/all")
    public List<GreetingModel> getAll() {
        return grettingService.getAll();
    }

    @PutMapping("/edit/{id}")
    public GreetingModel editGreetingById(@PathVariable long id, @RequestParam String message) {
        return grettingService.editGreetingById(id, message);
    }
}
