package com.example.dependencyInjection.gadgets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HP implements Laptop {
    @Autowired
    @Qualifier("Samsung")
    Laptop laptop1;

    @Override
    public void spec() {
        System.out.println(laptop1.getRAM());
    }
}
