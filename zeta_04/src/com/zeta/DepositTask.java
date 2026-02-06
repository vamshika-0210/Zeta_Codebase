package com.zeta;

public class DepositTask extends Thread{
    public Account account;
    public float amount;
    public DepositTask(Account account, float amount){
        this.account = account;
        this.amount = amount;
    }
    public void run(){
        String Thread = getName();
        System.out.println("Deposit handled by thread: "+Thread);
        boolean success = account.deposit(amount);
        if (success) {
            System.out.println("Deposit was successful! Balance now: "+account.getBalance());
        } else {
            System.out.println("Deposit was unsuccessful! Try again");
        }
    }
}
