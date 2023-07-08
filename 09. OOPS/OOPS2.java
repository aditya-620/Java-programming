//getter and setter methods
public class OOPS2 {
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Aditya";
        myAcc.setPassword("123456");
        System.out.println(myAcc.getPassword());
    }
}

class BankAccount {
    public String username;
    private String password;

    //setter
    public void setPassword(String password){
        this.password = password;
    }

    //getter
    String getPassword(){
        return password;      //return this.password can also be used
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)