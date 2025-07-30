package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Printer printer = context.getBean(Printer.class);
        UserService userService = context.getBean(UserService.class);

        userService.setPrinter(printer);
        userService.usePrinter("Hello Config Context");

        context.close();
    }
}
