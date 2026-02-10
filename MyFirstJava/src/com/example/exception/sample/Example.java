package com.example.exception.sample;

public class Example {
    public void method1() {
        try {
            int x = 2;
            int y = 10;
            int z = y / x;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public void method2() throws Exception {
        int x = 2;
        int y = 10;
        int z = y / x;
    }
}
