
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        String in = scanner.nextLine();
        boolean isFound = list.contains(in);   
        
        if (isFound) {
            System.out.println(in + " was found!");
        } else {
            System.out.println(in + " was not found!");
        }
    }
}
