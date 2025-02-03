package Assignment0302;

class BankAccount {
    private static String bankName = "HDFC Bank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Balance: " + this.balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Harsh", 1478, 11000.00);
        BankAccount acc2 = new BankAccount("Ayush", 1342, 17000.00);

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}

