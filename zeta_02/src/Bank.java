import java.util.ArrayList;
import java.util.List;

public class Bank {
    CreditCardBase IssueCard(CustomerDetails Customer){
        List<CreditCardBase> cards = new ArrayList<>();
        CreditCardBase card1 = new EmeraldCreditCard(Customer);
        cards.add(card1);
        return card1;
    }

}
