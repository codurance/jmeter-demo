package com.codurance.jmeterdemo.greeting;

import com.codurance.jmeterdemo.greeting.model.MyEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/hello")
    String greet() {
        logger.info("Greetings!");
        return "Hello World!";
    }

    @PostMapping("/event")
    MyEvent createEvent(@RequestBody MyEvent event) {
        logger.info("Getting request {}", event);
        return event;
    }
}
