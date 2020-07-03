package com.example.demo.service;

import com.example.demo.exception.UnlikeNameException;
import org.openapitools.model.Greeting;
import org.springframework.stereotype.Service;

import static java.lang.System.out;

@Service
public class TestService {
    private static final String HELLO = "hello";
    private static final String UNLIKE_NAME = "Zbyszek";

    public String genGreeting() {
        return HELLO;
    }

    public void writeGreeting(Greeting greeting) {
        if (greeting.getName().equals(UNLIKE_NAME)) {
            throw new UnlikeNameException("mess");
        }
        out.println("Hello " + greeting.getName() + " in beautiful open api world :) ");
    }
}