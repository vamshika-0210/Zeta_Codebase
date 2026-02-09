public class EmeraldCreditCard extends CreditCardBase implements ICreditCard{

    public EmeraldCreditCard(CustomerDetails Customer) {
        super(Customer);
    }
    @Override
    public boolean transaction(MerchantAccount recipient, float amount) {
        return true;
    }
}
