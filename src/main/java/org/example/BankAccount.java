package org.example;


import lombok.Getter;

public class BankAccount {
    @Getter
    private int accountNumber;
    private String accountName;
    @Getter
    private double balance;

    public BankAccount(int accountNumber, String accountName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientFundsException {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
    }

    public String getAccountSummary() {
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName + "\nBalance: $" + balance;
    }

}
