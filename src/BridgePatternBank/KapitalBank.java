package BridgePatternBank;

public class KapitalBank extends Bank{

    public KapitalBank(String userName , String userStatus){
        super.userStatus=userStatus;
        super.userName=userName;

    }


    @Override
    public boolean addUser() {
        try{
            System.out.println("New "+userName+" addded with "+ userStatus+"  ...Kapital Bank");
            return true;
        }catch(Exception e){
            System.err.println("Cant Create New User something went wrong");
            e.printStackTrace();
            return false;
        }

    }
}
