package com.example.dependencyInjection.car;

import org.springframework.stereotype.Component;

@Component
public interface Engine {
    public String getType();
}
