import java.util.function.Consumer;
@FunctionalInterface
interface TwoParameters {
    int[] twoParameter(int[] arr, int x);
}
public class LambdaDemo {
    public static void main(String[] args){
        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("hello! my name is vamshika");

        ArrayIncrement array = (arr) -> {
            for (int i=0;i<arr.length;i++){
                arr[i]=arr[i]+2;
            }
            return arr;
        };
        int[] numbers = {1,2,3,4,5,6};
        int sum =0;
        array.increment(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

        ArrayIncrement assignment2 = (arr) -> {
            for (int i=0;i<arr.length;i++){
                if (arr[i]%2==0){
                    arr[i]=arr[i]+2;
                }
            }
            return arr;
        };
        assignment2.increment(numbers);
        TwoParameters assignment3 = (arr, x) -> {
            for(int i=0;i<arr.length;i++){
                if (arr[i]%2==0){
                    arr[i]=arr[i]+x;
                }
            }
            return arr;
        };
        assignment3.twoParameter(numbers, 5);
        ArrayIncrement assignment4 = (arr) -> {
            for(int i=0;i<arr.length;i+=3){
                //sum +=  arr[i];
            }
            return arr;
        };



    }


}
