package com.ThriamBank;

public class Account implements BankOperations {
    private static double balance = 0;
    private String name;
    private String password;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) throws Exception {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new Exception("Insufficient balance");
        }
    }

    @Override
    public double checkBalance() {
        return getBalance();
    }

    public static double getBalance() {
        return balance;
    }

    public void editProfile(String newName, String newPassword) {
        this.name = newName;
        this.password = newPassword;
    }

    public boolean checkPassword(String pass) {
        return this.password.equals(pass);
    }
}