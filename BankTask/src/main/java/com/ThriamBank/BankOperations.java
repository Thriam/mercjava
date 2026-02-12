package com.ThriamBank;

public interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount) throws Exception;
    double checkBalance();
    void editProfile(String newName, String newPassword);
    boolean checkPassword(String password);
}