
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account newAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.00);
        
        newAccount.withdrawal(100);
        myAccount.deposit(100);
        
        System.out.println(newAccount);
        System.out.println(myAccount);
    }
}
