package com.zeta;
import java.util.logging.Logger;
public class Bank {
    Logger logger = Logger.getLogger("bank");
    public void transfer(Account acc1, Account acc2, float amount) {
        try {
            acc1.withdraw(amount);
        } catch (InsufficientBalanceException InsufficientBalanceException) {
            logger.severe(InsufficientBalanceException.getMessage());
            return;
        } catch (IllegalArgumentException IllegalArgumentException) {
            logger.severe(IllegalArgumentException.getMessage());
            return;
        }
        acc2.deposit(amount);
    }
}
