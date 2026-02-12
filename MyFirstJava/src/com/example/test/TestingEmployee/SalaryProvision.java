package com.example.test.TestingEmployee;

public class SalaryProvision extends Employee {
    public double salary(String designation) {
        double salary = 0;
        double perDaySalary = super.getSalary()/365.0;
        if (super.getLeavesTaken() <= 32)
            salary = super.getSalary();
        else
            salary = super.getSalary() - (perDaySalary*super.getLeavesTaken());
        if(designation.equals("Programmer"))
            salary = salary * 1.1;
        else if(designation.equals("Designer"))
            salary = salary * 1.2;
        else
            salary = salary - (perDaySalary*super.getLeavesTaken());
        return salary;
    }
}
