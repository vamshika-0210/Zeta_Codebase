import com.zeta.ACCOUNT_TYPE;
import com.zeta.Account;
import com.zeta.CurrentAccount;
import com.zeta.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Account account = new SavingsAccount(145);
        Account current = new CurrentAccount( 872);

        List<Object> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(current);

    }
}
