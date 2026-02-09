package com.example.oops.inheritance;

import com.example.oops.Interface.Employee;
import com.example.oops.Interface.Person;

public class Test {
    public static void main(String[] args) {
        Person p = new Employee();
        Person p1 = new Student();
//        Person p = new Person();
//        Employee e = new Employee();
//        Manager m = new Manager(1, "Alice", 101, "Sales");
//        e.id = 1001;
        TouchScreen ts = new TouchScreen(true);
    }
}
