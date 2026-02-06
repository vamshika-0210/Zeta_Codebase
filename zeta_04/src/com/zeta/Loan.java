package com.zeta;

public class Loan {
    //float loanAmount;
    int interestRate;
    int MonthlyInterestRate;

    Loan(){
        this.interestRate=12;
        this.MonthlyInterestRate = 12/(12*100);
    }
    public synchronized boolean checkLoanAmount(float loanAmount){
        return loanAmount < 1000000;
    }
    public synchronized boolean checkTenure(int tenure){
        return tenure < 36;
    }

    public synchronized float calculateLoanAmount(float loanAmount, int interestRate, int tenure){
        float monthlyPayable;
        monthlyPayable = (interestRate*loanAmount*((1+MonthlyInterestRate)^tenure))/(((1+MonthlyInterestRate)^tenure)*100);
        return monthlyPayable;
    }


}
