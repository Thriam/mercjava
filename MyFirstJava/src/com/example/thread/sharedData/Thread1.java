package com.example.thread.sharedData;


public class Thread1 extends Thread {
    PrintEvenNum obj;
    public Thread1(PrintEvenNum obj) {
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
