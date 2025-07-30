package com.example.springboot_fundamentals.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("mock")
@Component
public class MockTimeService implements TimeService {
    public int getTime() {
        return 2000;
    }
}
