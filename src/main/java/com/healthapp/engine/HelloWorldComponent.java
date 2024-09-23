package com.healthapp.engine;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class HelloWorldComponent {

    @PostConstruct
    public void sayHello() {
        System.out.println("Hello World from Spring Boot!");
    }
}