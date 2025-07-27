package Assignment3;

//BankingTransactionSystem.java

abstract class Account {
 protected String accountNumber;
 protected double balance;

 public Account(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public abstract double getBalance();

 public void displayDetails() {
     System.out.println("Account No: " + accountNumber + ", Balance: " + balance);
 }
}

class SavingsAccount extends Account {
 private double interestRate = 0.03;

 public SavingsAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 public void deposit(double amount) {
     balance += amount + (amount * interestRate);
     System.out.println("Deposited with interest in Savings: " + amount);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn from Savings: " + amount);
     } else {
         System.out.println("Insufficient Balance in Savings Account");
     }
 }

 public double getBalance() {
     return balance;
 }
}

class CheckingAccount extends Account {
 public CheckingAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited in Checking: " + amount);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn from Checking: " + amount);
     } else {
         System.out.println("Insufficient Balance in Checking Account");
     }
 }

 public double getBalance() {
     return balance;
 }
}

class Bank {
 private static int totalAccounts = 0;

 public Bank() {
     totalAccounts++;
 }

 public static int getTotalAccounts() {
     return totalAccounts;
 }
}

class Transaction {
 public final double transactionFee = 10.0;

 public final void performTransaction(Account account, String type, double amount) {
     System.out.println("Transaction Type: " + type);

     switch (type.toLowerCase()) {
         case "deposit":
             account.deposit(amount);
             break;

         case "withdraw":
             account.withdraw(amount + transactionFee);
             break;

         default:
             System.out.println("Invalid Transaction Type");
     }

     System.out.println("Transaction completed. Balance: " + account.getBalance());
     System.out.println("Transaction Fee Charged: " + transactionFee);
     System.out.println("--------------------------------------------");
 }
}

public class BankingTransactionSystem {
 public static void main(String[] args) {
     // Creating Bank accounts
     Bank bank1 = new Bank();
     Bank bank2 = new Bank();

     // Display total accounts
     System.out.println("Total Bank Accounts Created: " + Bank.getTotalAccounts());
     System.out.println("--------------------------------------------");

     // Create accounts
     SavingsAccount savings = new SavingsAccount("SA1001", 5000);
     CheckingAccount checking = new CheckingAccount("CA1001", 3000);

     // Transaction object
     Transaction transaction = new Transaction();

     // Perform transactions
     transaction.performTransaction(savings, "deposit", 1000);
     transaction.performTransaction(savings, "withdraw", 2000);

     transaction.performTransaction(checking, "deposit", 500);
     transaction.performTransaction(checking, "withdraw", 3500);
 }
}

