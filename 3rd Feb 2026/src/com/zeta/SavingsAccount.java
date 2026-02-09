package com.zeta;

public class SavingsAccount implements Account{
    float balance;
    final int number;
    @Override
    public float getBalance() {
        return balance;
    }
    @Override
    public float setBalance(float balance) {
        this.balance = balance;
        return this.balance;
    }
    @Override
    public int getNumber() {
        return number;
    }
    @Override
    public void validate(float amount){
        if(amount<=0){
            throw new InsufficientBalanceException("balance is less than 0");
        }
    }
    public SavingsAccount(int number){
        this.number=number;
    }
    @Override
    public float deposit(float amount) {
        validate(amount);
        this.setBalance(this.getBalance()+amount);
        return this.getBalance();
    }
    @Override
    public float withdraw(float amount) {
       validate(amount);
       if (this.getBalance()<=amount) {
           throw new InsufficientBalanceException("Insufficient balance");
        }else{
           this.setBalance(this.getBalance() - amount);
           return this.getBalance();
       }
    }
}
