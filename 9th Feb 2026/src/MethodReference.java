import java.util.function.Function;

class Util {
    int square(int x){
        return x*x;
    }
    static int sum (int x, int y){
        return x*y;
    }
}

public class MethodReference {
    public static void main(String[] args){
        Util util = new Util();
    }
}
