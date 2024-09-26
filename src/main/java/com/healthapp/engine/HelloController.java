package com.healthapp.engine;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/secured")
    public String securedEndpoint() {
        return "You have accessed a secured endpoint!";
    }
}