import com.zeta.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Account account = new SavingsAccount(145);
        Account current = new CurrentAccount( 872);

        List<Object> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(current);
        account.deposit(5000);
        current.deposit(5000);
        Bank b1 = new Bank(123);
        b1.transfer(account,current,2000);
        System.out.println("savings account:"+account.getBalance());
        System.out.println("current account:"+current.getBalance());


    }
}
