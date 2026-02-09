package com.zeta;

import java.util.concurrent.*;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main{
    public static void main(String[] args) {

        int choice;

        BankSetup account1 = new BankSetup(11000);
        BankSetup account2 = new BankSetup(5000);
        /*List<BankSetup> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        */
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Multithreading Banking System Application");
            System.out.println("Choice 1: Check Balance");
            System.out.println("Choice 2: Deposit Money");
            System.out.println("Choice 3: Withdraw Money");
            System.out.println("Choice 4: Simulate Parallel Withdrawals");
            System.out.println("Choice 5: Apply for a loan");
            System.out.println("Choice 6: Exit");


            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1: System.out.println("Balance: "+account1.getBalance.get());
                break;
                case 2: System.out.println("Enter amount to Deposit");
                float depositAmount = sc.nextInt();
                try {
                    if (depositAmount <= 0) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Amount is negative!");
                }
                Future future = executor.submit(() -> new DepositTask(account1,depositAmount));

                try {
                    System.out.println(future.get(10,TimeUnit.SECONDS));
                } catch (RuntimeException | TimeoutException | InterruptedException e){
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
                    break;
                case 3: System.out.println("Enter amount to Withdraw");
                float withdrawAmount = sc.nextInt();
                    try {
                        if (withdrawAmount <= 0) {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.out.println("Amount is negative!");
                    }

                executor.submit(()->new WithdrawTask(account1,withdrawAmount));
                break;
                case 4: System.out.println("Withdrawal parallel! Enter the withdrawal amount: " );
                float withdrawAmount1 = sc.nextInt();
                float withdrawAmount2 = sc.nextInt();
                float withdrawAmount3 = sc.nextInt();
                executor.submit(()-> new WithdrawTask(account1,withdrawAmount1));
                executor.submit(()-> new WithdrawTask(account1,withdrawAmount2));
                //executor.submit(new WithdrawTask(account1,withdrawAmount3));
                break;
                case 5: System.out.println("Applying for a loan");
                if (account1.getBalance.get()>10000){
                    System.out.println("Enter loan amount");
                    float loanAmount = sc.nextInt();
                    System.out.println("Enter tenure");
                    int tenure = sc.nextInt();
                    //LoanTask loanTask = new LoanTask(account1, loanAmount, tenure);
                    executor.submit(()->new LoanTask(account1, loanAmount, tenure));
                } else {
                    System.out.println("Balance amount not sufficient to provide loan.");
                }
                break;
                case 6: System.out.println("Shutting down the system");
                executor.shutdown();
                sc.close();
                System.exit(0);
                break;
                default: System.out.println("Invalid input! Try again");
            }
        }
    }
}
