package com.example.dependencyInjection.gadgets;

import org.springframework.stereotype.Component;

@Component("Crucial")
public class CrucialRAM implements RAM {
    @Override
    public String getRAM() {
        return "CrucialRAM";
    }
}
