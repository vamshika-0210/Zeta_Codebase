public interface ICreditCard {
    boolean transaction(MerchantAccount recipient, float amount);
}
