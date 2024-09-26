package bank;
class Account{
public String name;   // can be accessed by anywhere in the program
//    String name;     // can be accessed within the package not outside the package
protected  String email;  // can be accessed within the package and only accessed by the subclasses of the other package
private String password;

// getter and setter
public String getPassword(){
return this.password;
}
    public void setPassword(String pass){
    this.password=pass;
    }

}
public class Bank {
     public static void main(String args[]){
         Account account1=new Account();
         account1.name="Suryavanshi";
         account1.email="suyash54325@gmail.com";
        account1.setPassword("abcd");
         System.out.println(account1.getPassword());
     }
}
