public class Worker extends Thread{
    public Worker(String string){
        super(string);
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("hello from thread: "+Thread.currentThread()+"Iteration i= "+i);
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
