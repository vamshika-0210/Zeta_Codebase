package com.zeta;

public class Transfer extends Bank{
    public Transfer(int number) {
        super(number);
    }
    public void transferMethod(int acc1,int acc2){
        acc1.withdraw();
    }
}
