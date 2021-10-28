package BridgePatternBank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new BankRespublika("Aiq" , "Fiziki");
        Customer newCustomer  =new Customer(bank);
        Bank bank1 = new KapitalBank("Rustem", "VIP");
Customer newCustomer1 = new Customer(bank1);
newCustomer1.addingNewUserToTheBank();
     boolean isAdded=   newCustomer.addingNewUserToTheBank();
  String result=  isAdded?"Success":"Failure" ;
        System.out.println(result);
    }
}
