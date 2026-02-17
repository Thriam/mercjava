package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyWebController {
    @RequestMapping("/home")
    public String home(){
        return "Home.html";
    }

    @RequestMapping("/aboutUs")
    public String aboutUs(){
        return "AboutUs.html";
    }

    @RequestMapping("/rules")
    public String rules(){
        return "rules.html";
    }
}
