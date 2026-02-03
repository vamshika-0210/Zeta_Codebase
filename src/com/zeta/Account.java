package com.zeta;

public abstract class Account {
    public Account(int number){
        this.number=number;
    }
    float balance;

    public float getBalance() {
        return balance;
    }

    public float setBalance(float balance) {
        this.balance = balance;
        return balance;
    }

    public int getNumber() {
        return number;
    }

    private final int number;
    public abstract float deposit(float amount);
    public abstract float withdraw(float amount);


}
