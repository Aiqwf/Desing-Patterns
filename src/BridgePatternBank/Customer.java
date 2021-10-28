package BridgePatternBank;

public class Customer {
    protected Bank bank;

    public Customer ( Bank bank ){

        this.bank = bank;
    }
    boolean addingNewUserToTheBank(){
return bank.addUser();
    }


}
