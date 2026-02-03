import com.zeta.*;
import java.util.ArrayList;
import java.util.List;

import static com.zeta.ACCOUNT_TYPE.current;

public class Main {
    public static void main(String[] args){
        Account account = new SavingsAccount(145);
        Account current = new CurrentAccount( 872);
        List<Object> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(current);
        //accounts.forEach(ac1 -> ac1.deposit(1000));
        account.deposit(5000);
        current.deposit(5000);
        Bank b1 = new Bank();
        b1.transfer(account,current,-4000);
        System.out.println("savings account:"+account.getBalance());
        System.out.println("current account:"+current.getBalance());
    }
}
