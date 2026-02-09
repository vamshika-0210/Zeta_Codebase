public class RubyCreditCard extends CreditCardBase implements ICreditCard{
        public RubyCreditCard(CustomerDetails Customer) {
            super(Customer);
        }
        @Override
        public boolean transaction(MerchantAccount recipient, float amount) {
            return true;
        }
    }

