package com.example.springboot_fundamentals.controller;

import com.example.springboot_fundamentals.Service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TimeController {

    private final TimeService timeService;

    @Autowired
    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @RequestMapping("/time")
    @ResponseBody
    public String getTime() {
        return String.valueOf(timeService.getTime());
    }
}
