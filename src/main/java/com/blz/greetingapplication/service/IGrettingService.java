package com.blz.greetingapplication.service;

import com.blz.greetingapplication.dto.GreetingDTO;
import com.blz.greetingapplication.model.GreetingModel;

import java.util.List;

public interface IGrettingService {
    GreetingModel addGreeting(GreetingDTO greetingDTO);

    GreetingModel getGreetingById(long id);

    List<GreetingModel> getAll();

    GreetingModel editGreetingById(long id, String message);

}
