
import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class BankTest {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank();

            BankAccount account1 = bank.createAccount("John Doe", 1000);
            BankAccount account2 = bank.createAccount("Jane Doe", 500);

            System.out.println("Initial Account 1:\n" + account1.getAccountSummary());
            System.out.println("\nInitial Account 2:\n" + account2.getAccountSummary());

            account1.deposit(500);
            System.out.println("\nAccount 1 after deposit:\n" + account1.getAccountSummary());

            account2.withdraw(200);
            System.out.println("\nAccount 2 after withdrawal:\n" + account2.getAccountSummary());

            bank.transferMoney(1, 2, 300);
            System.out.println("\nAccount 1 after transfer:\n" + account1.getAccountSummary());
            System.out.println("\nAccount 2 after transfer:\n" + account2.getAccountSummary());

            // Testing exception handling
            try {
                account1.withdraw(2000); // Insufficient funds
            } catch (InsufficientFundsException e) {
                System.out.println("\nException: " + e.getMessage());
            }

            try {
                bank.transferMoney(1, 3, 100); // Account not found
            } catch (AccountNotFoundException e) {
                System.out.println("\nException: " + e.getMessage());
            }

            try {
                account1.deposit(-200); // Negative amount
            } catch (NegativeAmountException e) {
                System.out.println("\nException: " + e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
