package com.example.exception.sample;

public class Test {
    public static void main(String[] args) {
        Example a = new Example();
        a.method1();
        try {
            a.method1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
