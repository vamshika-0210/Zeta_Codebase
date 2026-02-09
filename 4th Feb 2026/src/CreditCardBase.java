public abstract class CreditCardBase {
    private float DueAmount;
    private int number;
    CustomerDetails Customer;
    public int getNumber() {
        return number;
    }
    public float getDueAmount() {
        return DueAmount;
    }
    public void setDueAmount(float dueAmount) {
        DueAmount = dueAmount;
    }
    public CreditCardBase(CustomerDetails customer){
        this.Customer=Customer;
    }
}
