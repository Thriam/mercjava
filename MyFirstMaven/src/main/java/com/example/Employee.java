package com.example;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private int leavesTaken;

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getDesignation() {
        return designation;
    }

    protected void setDesignation(String designation) {
        this.designation = designation;
    }

    protected double getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }

    protected int getLeavesTaken() {
        return leavesTaken;
    }

    protected void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }
}
