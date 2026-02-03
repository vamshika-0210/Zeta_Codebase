package com.zeta;

public class CurrentAccount extends Account{
    @Override
    public float deposit(float amount) {
        return 0;
    }

    @Override
    public float withdraw(float amount) {
        return 0;
    }

    public CurrentAccount(int i){
        super(i);
    }

}
