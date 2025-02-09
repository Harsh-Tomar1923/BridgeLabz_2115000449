package oops;

import java.util.ArrayList;
import java.util.List;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid withdrawal amount.");
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount {
    private double interestRate = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02;
    private double loanLimitFactor = 2.0;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved.");
        } else {
            System.out.println("Loan request exceeds eligibility.");
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * loanLimitFactor;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount sa = new SavingsAccount("SA101", "Alice", 50000);
        CurrentAccount ca = new CurrentAccount("CA202", "Bob", 100000);

        accounts.add(sa);
        accounts.add(ca);

        for (BankAccount account : accounts) {
            account.displayDetails();
            double interest = account.calculateInterest();
            System.out.println("Interest Earned: " + interest);

            if (account instanceof Loanable) {
                System.out.println("Loan Eligibility: " + ((Loanable) account).calculateLoanEligibility());
                ((Loanable) account).applyForLoan(150000);
            }
            System.out.println();
        }
    }
}
