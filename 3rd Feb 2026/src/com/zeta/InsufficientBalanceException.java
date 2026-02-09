package com.zeta;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String msg){
        throw new InsufficientBalanceException("balance insufficient");
    }
}
