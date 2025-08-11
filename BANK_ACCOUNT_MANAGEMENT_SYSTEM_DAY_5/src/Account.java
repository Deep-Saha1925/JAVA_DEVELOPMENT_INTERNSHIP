import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountHolder;
    private double balance;
    private List<String> transactions;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with initial balance: " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            transactions.add("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void viewBalance(){
        System.out.println("Current balance: " + balance);
    }

    public void viewTransactions() {
        System.out.println("\nTransaction history for " + accountHolder + ":");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
