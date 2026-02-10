package com.example.exception.userDefinedException.creditCardTask;

public class InvalidCreditException extends RuntimeException {
    public InvalidCreditException() {}
    public InvalidCreditException(String msg) {
        super(msg);
    }
}
