//package com.company;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Bank ban = new Bank();
    
        // Add some accounts to the arrayList
        ban.addAccount(new BankAccount(2564, 500000.0));
        ban.addAccount(new BankAccount(9582, 1200.0));
        ban.addAccount(new BankAccount(5689, 3800.0));
        ban.addAccount(new BankAccount(4532, 5900.0));
        
        // Test getTotalBalance
        System.out.println("Total balance: $" + ban.getTotalBalance());
        
        // Test count
        System.out.println("Accounts with at least $1000: " + ban.count(1000));
        
        // Test check
        BankAccount found = ban.check(2564);
        if (found != null) {
            System.out.printf("Found account %d with balance: $%.2f\n" ,ban.getAccNum(2564), found.getBalance());
        }
        
        // Test getMax
        BankAccount max = ban.getMax();
        if (max != null) {
            System.out.println("The account which has the largest balance : Acc#" + max.getAccNum() + 
                             " with $" + max.getBalance());
        }
    }
}

class Bank {
    private ArrayList<BankAccount> accounts;
    // encapsulated arraylist variable
    public Bank() {
        accounts = new ArrayList<BankAccount>();
    }
    
    public void addAccount(BankAccount a) {
        accounts.add(a);
    }
    //return total balance
    public double getTotalBalance() {
        double total = 0;
        for (BankAccount a : accounts) {
            total = total + a.getBalance();
        }
        return total;
    }
    // counting
    public int count(double atLeast) {
        int count = 0;
        for (BankAccount a : accounts) {
            if (a.getBalance() >= atLeast) {
             count++;
            }
        }
        return count;
    }
    // checking account number
    public BankAccount check(int accNum) {
        for (BankAccount a : accounts) {
            if (a.getAccNum() == accNum) {
                return a;
            }
        }
        return null;
    }
    
    public BankAccount getMax() {
        if (accounts.size() == 0) {
            return null;
        }
        
        BankAccount largestAssume = accounts.get(0);
        for (int i = 1; i < accounts.size(); i++) {
            BankAccount now = accounts.get(i);
            if (now.getBalance() > largestAssume.getBalance()) {
                largestAssume = now;
            }
        }
        return largestAssume;
    }
}



class BankAccount {
    private int accNum;
    private double balance;
    
    public BankAccount(int accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }
    
    public int getAccNum() {
        return accNum;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
}