package com.example;

import org.springframework.stereotype.Component;

@Component
public class Printer {
    public void print(String message) {
        System.out.println("Message To User: " + message);
    }
}
