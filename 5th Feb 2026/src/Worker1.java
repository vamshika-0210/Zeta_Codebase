public class Worker1 extends Thread{
    public Counter counter;
    public Worker1(Counter counter){
        this.counter = counter;
    }
    public void run(){
        try{
            counter.increment();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
