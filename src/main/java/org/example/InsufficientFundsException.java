package org.example;

public class InsufficientFundsException extends BankException {

    public InsufficientFundsException(String s) {
        super("Недостатньо коштів на рахунку для цієї операції");
    }
}