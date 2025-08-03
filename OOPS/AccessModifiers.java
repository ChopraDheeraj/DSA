public class AccessModifiers{
    public static void main(String args[]){
        BankAccount myAcc= new BankAccount();
        myAcc.username = "DC";
        // myAcc.password = "abcdefgi"; //will throw error
        myAcc.setPassword("abhcde"); //this will only change the password, and we can never access the password because private
    }

}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}