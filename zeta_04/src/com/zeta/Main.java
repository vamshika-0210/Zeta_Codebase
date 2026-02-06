package com.zeta;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(5000);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Multithreading Banking System Application");
            System.out.println("Choice 1: Check Balance");
            System.out.println("Choice 2: Deposit Money");
            System.out.println("Choice 3: Withdraw Money");
            System.out.println("Choice 4: Simulate Parallel Withdrawals");
            System.out.println("Choice 5: Exit");

            int choice;
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1: System.out.println("Balance: "+account1.getBalance());
                break;
                case 2: System.out.println("Enter amount to Deposit");
                float depositAmount = sc.nextInt();
                executor.submit(new DepositTask(account1,depositAmount));
                break;
                case 3: System.out.println("Enter amount to Withdraw");
                float withdrawAmount = sc.nextInt();
                executor.submit(new WithdrawTask(account1,withdrawAmount));
                break;
                case 4: System.out.println("Withdrawal parallel! Enter the withdrawal amount: " );
                float withdrawAmount1 = sc.nextInt();
                float withdrawAmount2 = sc.nextInt();
                executor.submit(new WithdrawTask(account1,withdrawAmount1));
                executor.submit(new WithdrawTask(account1,withdrawAmount2));
                break;
                case 5: System.out.println("Shutting down the system");
                executor.shutdown();
                sc.close();
                System.exit(0);
                break;
                default: System.out.println("Invalid input! Try again");
            }
        }
    }
}
