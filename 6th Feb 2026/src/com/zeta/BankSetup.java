package com.zeta;

import java.util.function.Function;
import java.util.function.Supplier;

public class BankSetup {
    private float balance;
    Supplier<Float> getBalance = () -> balance;
    Function<Float, Float> setBalance = (balance) -> this.balance=balance;

    //public synchronized void setBalance(float balance) {
      //  this.balance = balance;
    //}
    public BankSetup(float balance){
        this.balance = balance;
    }
        Function<Integer, Boolean> withdraw = amt -> {
            if (balance >= amt && amt > 0) {
                setBalance.apply(getBalance.get() - amt);
                return true;
            } else {
                return false;
            }
        };

    Function<Integer,Boolean> deposit = amount -> {
        if (amount >0){
            this.setBalance.apply(this.getBalance.get() + amount);
            return true;
        } else {
            System.out.println("Failed to deposit money!");
            return false;
        }
    };
}
