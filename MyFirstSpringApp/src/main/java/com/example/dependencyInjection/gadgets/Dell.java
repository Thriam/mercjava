package com.example.dependencyInjection.gadgets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dell implements Laptop {
    @Autowired
    @Qualifier("Crucial")
    Laptop laptop1;

    @Override
    public void spec() {
        System.out.println(laptop1.getRAM());
    }
}
