import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args){
        System.out.println("hello");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new worker2());
        executor.shutdown();
    }
}
class worker2 extends Thread{
    public void run(){
        System.out.println("Inside the run method");
    }
}
