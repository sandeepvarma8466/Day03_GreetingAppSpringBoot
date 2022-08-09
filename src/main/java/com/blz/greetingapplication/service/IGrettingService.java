package com.blz.greetingapplication.service;

import com.blz.greetingapplication.dto.GreetingDTO;
import com.blz.greetingapplication.model.GreetingModel;

public interface IGrettingService {
    GreetingModel addGreeting(GreetingDTO greetingDTO);
}
