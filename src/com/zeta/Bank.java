package com.zeta;
import java.util.logging.Logger;
public class Bank extends Account{
    Logger logger = Logger.getLogger("bank");


    public Bank(int number) {
        super(number);
    }

    public void transfer(Account acc1, Account acc2, float amount){

        if(acc1.getBalance()<=0){
            throw new InsufficientBalanceException("balance is less than 0");
        }else{
            acc2.setBalance(acc2.getBalance()+amount);
            acc1.setBalance(acc1.getBalance()-amount);
        }
    }

    @Override
    public float deposit(float amount) {
        return 0;
    }

    @Override
    public float withdraw(float amount) {
        return 0;
    }
}
