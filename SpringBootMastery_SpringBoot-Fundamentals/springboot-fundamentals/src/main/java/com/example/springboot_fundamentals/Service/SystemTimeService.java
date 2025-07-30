package com.example.springboot_fundamentals.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SystemTimeService implements TimeService {
    public int getTime() {
        return 1000;
    }
}
