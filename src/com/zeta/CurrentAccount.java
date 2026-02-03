package com.zeta;

public class CurrentAccount extends Account{
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

    public CurrentAccount(int i){
        super(i);
    }

}
