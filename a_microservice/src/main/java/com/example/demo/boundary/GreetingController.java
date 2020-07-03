package com.example.demo.boundary;

import com.example.demo.service.TestService;
import org.openapitools.api.HelloApi;
import org.openapitools.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class GreetingController implements HelloApi {

    private final TestService testService;

    @Autowired
    public GreetingController(TestService testService) {
        this.testService = testService;
    }

    @Override
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(testService.genGreeting());
    }

    @Override
    public ResponseEntity sendGreeting(@Valid Greeting greeting) {
        testService.writeGreeting(greeting);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}