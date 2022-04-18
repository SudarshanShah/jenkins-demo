package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greet")
    public String greetingMessage() {
        return "Hello, the application is deployed successfully on Tomcat using Jenkins!";
    }
}
