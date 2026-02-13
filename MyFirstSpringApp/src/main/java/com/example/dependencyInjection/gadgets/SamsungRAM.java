package com.example.dependencyInjection.gadgets;

import org.springframework.stereotype.Component;

@Component("Samsung")
public class SamsungRAM implements RAM {
    @Override
    public String getRAM() {
        return "Samsung RAM";
    }
}
