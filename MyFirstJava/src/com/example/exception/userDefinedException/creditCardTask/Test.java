package com.example.exception.userDefinedException.creditCardTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer input = new StringBuffer();
        input.append(br.readLine());
        CashCounter cashCounter = new CashCounter();
        try {
            cashCounter.cardPaymentEligibility(input);
        } catch (InvalidCreditException e) {
            throw new RuntimeException(e);
        }
    }
}
