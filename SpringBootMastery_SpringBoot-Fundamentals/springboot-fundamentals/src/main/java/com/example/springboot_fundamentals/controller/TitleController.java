package com.example.springboot_fundamentals.controller;

import com.example.springboot_fundamentals.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TitleController {

    private AppProperties appProperties;

    @Autowired
    public TitleController(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @RequestMapping("/title")
    @ResponseBody
    public String title() {
        return appProperties.getTitle();
    }
}
