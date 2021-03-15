
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String in = scanner.nextLine();
            
            if (in.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(in);
            
            System.out.println(number * number * number);
        }

    }
}
