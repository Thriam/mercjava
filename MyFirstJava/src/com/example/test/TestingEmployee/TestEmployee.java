package com.example.test.TestingEmployee;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestEmployee {

    @Test
    public void testSalaryProvisionLeavesWithinLimit() {
        SalaryProvision sp = new SalaryProvision();
        sp.setSalary(60000);
        sp.setLeavesTaken(30);
        double result = sp.salary("Programmer");
        assertEquals(66000.0, result, 0.01);
    }

    @Test
    public void testSalaryProvisionLeavesOverLimit() {
        SalaryProvision sp = new SalaryProvision();
        sp.setSalary(60000);
        sp.setLeavesTaken(35);
        double result = sp.salary("Designer");
        assertEquals(65095.8904109589, result, 0.01);
    }

    @Test
    public void testSalaryProvisionOtherDesignation() {
        SalaryProvision sp = new SalaryProvision();
        sp.setSalary(60000);
        sp.setLeavesTaken(40);
        double result = sp.salary("Manager");
        assertEquals(46849.32, result, 0.01);
    }
}