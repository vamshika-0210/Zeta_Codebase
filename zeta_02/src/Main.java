public class Main {
    public static void main(String[] args){
        Bank bank1 = new Bank();
        //System.out.println(bank1.cards);
        CustomerDetails customer1 = new CustomerDetails();
        CustomerDetails customer2 = new CustomerDetails();
        CustomerDetails customer3 = new CustomerDetails();
        bank1.IssueCard(customer1);
        bank1.IssueCard(customer2);
        bank1.IssueCard(customer3);
    }

}
