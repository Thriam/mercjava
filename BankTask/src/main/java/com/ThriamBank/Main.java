package com.ThriamBank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to ThriamBank");
        System.out.println("Lets create an account...");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = "";
        try {
            name = br.readLine();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
            return;
        }
        System.out.println("\nEnter your password: ");
        String password = "";
        try {
            password = br.readLine();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
            return;
        }
        Account account = new Account(name, password);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Edit Profile");
            System.out.println("5. Check Password");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            try {
                int input = Integer.parseInt(br.readLine());
                switch (input) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        try {
                            double depositAmount = Double.parseDouble(br.readLine());
                            account.deposit(depositAmount);
                            System.out.println("Deposited " + depositAmount);
                        } catch (NumberFormatException | IOException e) {
                            System.out.println("Invalid amount. Please try again.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        try {
                            double withdrawAmount = Double.parseDouble(br.readLine());
                            try {
                                account.withdraw(withdrawAmount);
                                System.out.println("Withdrew " + withdrawAmount);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        } catch (NumberFormatException | IOException e) {
                            System.out.println("Invalid amount. Please try again.");
                        }
                        break;
                    case 3:
                        System.out.println("Current balance: " + account.checkBalance());
                        break;
                    case 4:
                        System.out.print("Enter new name: ");
                        String newName = "";
                        try {
                            newName = br.readLine();
                        } catch (IOException e) {
                            System.out.println("Error reading input: " + e.getMessage());
                            break;
                        }
                        System.out.print("Enter new password: ");
                        String newPassword = "";
                        try {
                            newPassword = br.readLine();
                        } catch (IOException e) {
                            System.out.println("Error reading input: " + e.getMessage());
                            break;
                        }
                        account.editProfile(newName, newPassword);
                        System.out.println("Profile updated.");
                        break;
                    case 5:
                        System.out.print("Enter password to check: ");
                        String checkPass = "";
                        try {
                            checkPass = br.readLine();
                        } catch (IOException e) {
                            System.out.println("Error reading input: " + e.getMessage());
                            break;
                        }
                        if (account.checkPassword(checkPass)) {
                            System.out.println("Password is correct.");
                        } else {
                            System.out.println("Password is incorrect.");
                        }
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
