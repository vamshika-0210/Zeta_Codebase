import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
public class Main {
    public static void main(String[] args){
        //int[] arr = {1,2,3,4,5,6,7,7,8,9};
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //int result = forkJoinPool.invoke(new sumTask(arr, 0, arr.length));
        //System.out.println("Result: "+result);
        List<BankAccount> list = new ArrayList<>();
        for(int i=0; i<20;i++){
           list.add( new BankAccount(5000));
        }
        int result = forkJoinPool.invoke(new sumTask(list, 0, list.size()));
        System.out.println("Result: "+result);
    }
}
