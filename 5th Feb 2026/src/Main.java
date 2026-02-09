public class Main {
    public static void main(String[] args) throws InterruptedException{
        //Worker worker0 = new Worker("worker1");
        //worker0.start();
        //Worker worker1 = new Worker("worker2");
        //worker1.start();
        Counter count = new Counter();
        Worker1 worker1 = new Worker1(count);
        System.out.println("Main 1 "+count.getValue());
        worker1.start();
        worker1.join();
        Worker1 worker2 = new Worker1(count);
        System.out.println("Main 2 "+count.getValue());
        worker2.start();
        worker2.join();
        System.out.println("Main 3 "+count.getValue());

    }
}
