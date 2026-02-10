package com.example.exception.userDefinedException.creditCardTask;

import com.example.exception.userDefinedException.InvalidAgeException;

public class CashCounter {
    public void cardPaymentEligibility(StringBuffer cardNumber) throws InvalidCreditException {
        if (cardNumber.length() != 16) {
            throw new InvalidCreditException("Invalid Credit Card number");
        }
        else {
            System.out.println("Card number payment is eligible for the card");
        }
    }
}
