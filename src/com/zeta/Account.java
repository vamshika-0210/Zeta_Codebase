package com.zeta;

public interface Account{
    float deposit(float amount);
    float withdraw(float amount);
    float getBalance();
    float setBalance(float balance);
    int getNumber();
    void validate(float amount);
}

