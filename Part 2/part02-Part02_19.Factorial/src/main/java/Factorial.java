
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int last = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        
        for (int i = 1; i <= last; i++){
            factorial = i * factorial;
        }
        
        System.out.println("Factorial: " + factorial);

    }
}
