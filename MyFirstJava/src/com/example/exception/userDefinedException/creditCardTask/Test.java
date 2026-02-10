package com.example.exception.userDefinedException.creditCardTask;

public class Test {
    public static void main(String[] args) {
        CashCounter cashCounter = new CashCounter();
        try {
            cashCounter.cardPaymentEligibility("1234567812345678");
        } catch (InvalidCreditException e) {
            throw new RuntimeException(e);
        }
    }
}
