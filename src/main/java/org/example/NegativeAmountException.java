package org.example;

public class NegativeAmountException extends BankException {

    public NegativeAmountException(String s) {
        super("Сума не може бути від'ємною");
    }
}