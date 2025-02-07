package Inheritence;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayAccountDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenure;

    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayAccountDetails();
        System.out.println("Tenure: " + tenure + " years");
    }
}

public class BankSystemTest {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount("SA12345", 5000, 3.5);
        CheckingAccount account2 = new CheckingAccount("CA67890", 2000, 1000);
        FixedDepositAccount account3 = new FixedDepositAccount("FD11223", 10000, 5);

        account1.displayAccountType();
        System.out.println();

        account2.displayAccountType();
        System.out.println();

        account3.displayAccountType();
    }
}
