package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig {
    @Bean("Movie1")
    public Movie getMovie1() {
        return new Movie();
    }

    @Bean("Movie2")
    public Movie getMovie2() {
        return new Movie();
    }

    @Bean("Car1")
    public Car getCar1() {
        return new Car();
    }

    @Bean("Car2")
    public Car getCar2() {
        return new Car();
    }

    @Bean("Fruit1")
    public Fruit getFruit1() {
        return new Fruit();
    }

    @Bean("Fruit2")
    public Fruit getFruit2() {
        return new Fruit();
    }

    @Bean("Theatre1")
    public Theatre getTheatre1() {
        return new Theatre();
    }

    @Bean("Theatre2")
    public Theatre getTheatre2() {
        return new Theatre();
    }
}
