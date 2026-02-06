package com.zeta;

public class WithdrawTask extends Thread{
    public Account account;
    public float amount;

    public WithdrawTask(Account account, float amount){
        this.account = account;
        this.amount = amount;
    }
    public void run(){
        String Thread = getName();
        System.out.println("Withdraw handled by thread: "+Thread);
        boolean success = account.withdraw(amount);
        if (success) {
            System.out.println("Withdraw was successful! balance now: " + account.getBalance());
        } else {
            System.out.println("Withdraw was unsuccessful! Try again");
        }
    }
}
