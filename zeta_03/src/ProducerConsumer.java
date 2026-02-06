public class ProducerConsumer {
    public static void main(String[] args){
        Buffer buffer = new Buffer();
        Thread producer = new Thread(() -> {
            try{
                for (int i=1;i<=5;i++){
                    buffer.produce(i);
            }
            } catch (Exception e){
                System.out.println(e);
            }
        });
        Thread consume = new Thread(() -> {
            try{
                for (int i=1;i<=5;i++){
                    buffer.consume();
            }
            } catch (Exception e){
                System.out.println(e);
            }
        });
        producer.start();
        consume.start();
    }
}
class Buffer {
    private int data;
    boolean available = false;
    synchronized void produce(int value) throws InterruptedException{
        while (available) wait();
        data = value;
        available = true;
        System.out.println("produced: "+ value);
        notify();
    }
    synchronized int consume() throws InterruptedException {
        while (!available) wait();
        available = false;
        System.out.println("Consumed" + data);
        notify();
        return data;
    }
}