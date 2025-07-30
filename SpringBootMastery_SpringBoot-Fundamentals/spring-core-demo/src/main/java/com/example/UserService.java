package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    private Printer printer;

    // Constructor For Setter Injection
    public UserService() {
    }

    // Construtor for Constructor Injection
    public UserService(Printer printer) {
        this.printer = printer;
    }

    // Setter Injection
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void usePrinter(String message) {
        printer.print(message);
    }
}

