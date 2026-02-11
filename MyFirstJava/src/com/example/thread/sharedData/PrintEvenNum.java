package com.example.thread.sharedData;

public class PrintEvenNum {
    static int num;
    public void printNum() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
