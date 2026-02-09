//fork is used for batch processing.

import java.util.List;
import java.util.concurrent.RecursiveTask;
class sumTask extends RecursiveTask<Integer>{
    public int threshold = 3;
    List<BankAccount> arr;
    int start, end;
    int sum = 0;
    sumTask(List<BankAccount> arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (start - end < threshold){
            for (int i=start; i<end;i++){
                float depositAmount = arr.get(i).getBalance();
                sum+=depositAmount;
            }
            return sum;
        } else {
            int mid = end-start/2;
            sumTask left = new sumTask(arr, start, mid);
            sumTask right = new sumTask(arr, mid, end);
            left.fork();
            int rightResult = right.compute();
            int leftResult = left.join();
            return rightResult + leftResult;
        }

    }
}
