package com.zeta;

public class Account {
    private float balance;

    public float getBalance() {
        return balance;
    }
    public synchronized void setBalance(float balance) {
        this.balance = balance;
    }
    public Account(float balance){
        this.balance = balance;
    }
    public synchronized boolean withdraw(float amount){
        if ((balance>=amount) && (amount>0)){
            this.setBalance(this.getBalance() - amount);
            return true;
        } else {
            System.out.println("Failed to withdraw money!");
            return false;
        }
    }
    public synchronized boolean deposit(float amount){
        if (amount > 0){
            this.setBalance(this.getBalance() + amount);
            return true;
        } else {
            System.out.println("Failed to deposit money!");
            return false;
        }
    }
}
