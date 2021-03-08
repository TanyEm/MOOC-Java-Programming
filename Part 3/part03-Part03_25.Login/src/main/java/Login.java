import java.util.Hashtable;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        Hashtable<String, String> users = new Hashtable<String, String>();
        
        users.put("alex", "sunshine");
        users.put("emma", "haskell");
                
        if (users.containsKey(username) && users.contains(password)){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
