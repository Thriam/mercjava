package com.example.oops.inheritance;

import com.example.oops.Interface.Employee;

public class Manager extends Employee {
    String team;
    public Manager(int id, String name, int empid, String team) {
        // super(id, name, empid);
        this.team = team;
        System.out.println("Manager class constructor");
    }
    public void display() {
        // System.out.println("ID: " + id);
        // System.out.println("Name: " + name);
        // System.out.println("EmpID: " + empid);
        System.out.println("Team: " + team);
    }
}
