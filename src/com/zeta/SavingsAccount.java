package com.zeta;

public class SavingsAccount extends Account{
    public SavingsAccount(int i){
        super(i);
    }

    @Override
    public float deposit(float amount) {
        setBalance(getBalance()+amount);
        return getBalance();
    }

    @Override
    public float withdraw(float amount) {
        if(getBalance()<=0){
            throw new InsufficientBalanceException("balance amount is less than 0");
        }else {
            setBalance(getBalance() - amount);
        }
        return getBalance();
    }


}
