package com.zeta;

public class LoanTask extends Thread{
    Loan loan = new Loan();
    int interestRate;
    public BankSetup account;
    public float loanAmount;
    public int tenure;

    public LoanTask(BankSetup account, float loanAmount, int tenure){
        this.account = account;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
    }
    public void run(){
        String Thread = getName();
        System.out.println("Loan handled by thread: "+Thread);
        boolean success = loan.checkLoanAmount.apply(loanAmount);
        System.out.println("success  "+success);
        if (!success){
            System.out.println("loan amount not valid");
        }
        boolean success1 = loan.checkTenure.apply(tenure);
        if (!success1) {
            System.out.println("Loan tenure not valid");
        }
        System.out.println("Calculating monthly payable amount");
        float Amount = loan.calculateLoanAmount(loanAmount, interestRate, tenure);
        System.out.println("Monthly payable amount: "+ Amount);

    }

}
