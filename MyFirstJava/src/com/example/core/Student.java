package com.example.core;

public class Student {
    int id;
    String name;
    Course c1;

    public Student(int id, String name, Course c1) {
        this.id = id;
        this.name = name;
        this.c1 = c1;
    }

    public void show() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
    }
}
