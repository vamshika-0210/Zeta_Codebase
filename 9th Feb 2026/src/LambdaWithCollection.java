import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaWithCollection {
    public static void main(String[] args){
        showWithArrayList();
    }

    static Predicate<BankAccount> removeFunction = account -> account.getBalance() % 2 ==0;

    public static void showWithArrayList(){
        List<BankAccount> accounts = new ArrayList<>();
        for (int i=0;i<10;i++){
            accounts.add(new BankAccount(i+1));
        }
        accounts.forEach((account) -> System.out.println(account.getBalance()));
        System.out.println("After sorting!");
        accounts.sort((account1, account2) -> (int)account2.getBalance() - (int)account1.getBalance());
        accounts.removeIf(removeFunction);
        accounts.forEach((account) -> System.out.println(account.getBalance()));

    }
}
