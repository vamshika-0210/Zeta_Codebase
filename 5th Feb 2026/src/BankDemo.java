public class BankDemo {
    public static void main(String[] args){
        BankAccount acc = new BankAccount(100);
        Thread t1 = new Thread(() -> acc.withdraw(80), "T1");
        Thread t2 = new Thread(() -> acc.withdraw(80), "T2");
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final balance = " + acc.getBalance());

    }
}
