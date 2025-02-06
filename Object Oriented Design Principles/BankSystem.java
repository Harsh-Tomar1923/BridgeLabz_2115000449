package Assignment0402;

import java.util.ArrayList;
import java.util.List;

// Bank clas

class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public Account openAccount(Customer customer, double initialDeposit) {
        Account newAccount = new Account(this, customer, initialDeposit);
        accounts.add(newAccount);
        customer.addAccount(newAccount);
        return newAccount;
    }

    public String getName() {
        return name;
    }
}

// Customer class

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Account balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getName() + ", Balance: " + account.getBalance());
        }
    }
}

// Account class

class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}

// Main class to demonstrate association

public class BankSystem {
    public static void main(String[] args) {
        Bank bank1 = new Bank("HDFC Bank");
        Bank bank2 = new Bank("Axis Bank");
        Bank bank3= new Bank("PNB Bank");

        Customer customer1 = new Customer("Harsh Tomar");
        Customer customer2 = new Customer("Ayush");


        bank1.openAccount(customer1, 1000);
        bank2.openAccount(customer1, 1500);
        bank1.openAccount(customer2, 2000);
        bank3.openAccount(customer2,8734);

        customer1.viewBalance();
        customer2.viewBalance();

    }
}

