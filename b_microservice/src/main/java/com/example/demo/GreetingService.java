package com.example.demo;

import com.example.demo.rest.api.DefaultApi;
import com.example.demo.rest.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class GreetingService {

    private final DefaultApi defaultApi;
    private final String NAME = "Zbysio";

    @Autowired
    public GreetingService(DefaultApi defaultApi) {
        this.defaultApi = defaultApi;
    }

    @PostConstruct
    public void sendGreeting() {
        defaultApi.sendGreeting(new Greeting().name(NAME));
    }

    @PostConstruct
    public void getGreeting() {
        System.out.println(defaultApi.hello());
    }

}