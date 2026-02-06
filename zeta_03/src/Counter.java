public class Counter {
    int counter  = 0;
    synchronized public void increment(){
        counter++;
        System.out.println("value in increment: "+counter);
    }
    synchronized int getValue(){
        return counter;
    }

}
