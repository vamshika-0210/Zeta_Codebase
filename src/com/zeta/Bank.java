package com.zeta;

public class Bank extends Account{
    public Bank(int number) {
        super(number);
    }

    @Override
    public float deposit(float amount) {
        return 0;
    }

    @Override
    public float withdraw(float amount) {
        return 0;
    }
    Account acc1 = new CurrentAccount(123);
    Account acc2 = new SavingsAccount(423);
    public boolean TranserMethod

}
