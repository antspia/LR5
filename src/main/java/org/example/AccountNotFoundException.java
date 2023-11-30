package org.example;

public class AccountNotFoundException extends BankException {

    public AccountNotFoundException(String s) {
        super("Рахунок з таким номером не знайдено");
    }
}