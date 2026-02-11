package com.example.thread.sharedData;

public class Thread2 extends Thread {
    PrintEvenNum obj;
    public Thread2(PrintEvenNum obj) {
        this.obj = obj;
    }
    public void run() {
        try {
            obj.printNum();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
