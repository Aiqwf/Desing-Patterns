package BridgePatternBank;

public class BankRespublika extends Bank{
    //protected String userStatus;
 //protected String userName;

 public BankRespublika(String userName , String userStatus){
     super.userStatus=userStatus;
     super.userName=userName;

 }
 //Creational  Behaviour
     @Override

    public boolean addUser() {
        try{
            System.out.println("New "+userName+" addded with "+ userStatus+"  ...Bank Respublika");
       return true;
        }catch(Exception e){
            System.err.println("Cant Create New User something went wrong");
            e.printStackTrace();
        return false;
        }

    }
}
