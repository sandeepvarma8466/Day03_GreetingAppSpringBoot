package com.blz.greetingapplication.controller;

import com.blz.greetingapplication.dto.GreetingDTO;
import com.blz.greetingapplication.model.GreetingModel;
import com.blz.greetingapplication.service.IGrettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
