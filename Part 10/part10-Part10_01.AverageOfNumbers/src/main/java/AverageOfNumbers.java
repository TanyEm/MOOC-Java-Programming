
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ints = new ArrayList<>();
        // Write your program here
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String in = scanner.nextLine();
            
            if (in.equals("end")) {
                break;
            }
            
            ints.add(in);
        }
        
        double avr = ints.stream()
                .mapToInt(in -> Integer.valueOf(in))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: " + avr);

    }
}
