package com.zeta;
import java.util.concurrent.Callable;

public class DepositTask implements Callable{
    public BankSetup account;
    public float amount;
    public DepositTask(BankSetup account, float amount){
        this.account = account;
        this.amount = amount;
    }
    @Override
    public Object call() throws Exception {
        String thread = Thread.currentThread().getName();
        System.out.println("Thread "+thread+" trying to deposit money of "+amount);
        try{
            account.deposit.apply((int)amount);
        } catch (RuntimeException e) {
            System.out.println("Deposit was unsuccessful." + e);
        }
        return account.getBalance.get();
    }
}
