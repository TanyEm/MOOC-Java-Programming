
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            double in = Double.valueOf(scanner.nextLine());
            
            if (in == 0) {
                break;
            } 
            
            count = count + 1;
            sum = sum + in;
        }
        
        double avr = sum / count;
        System.out.println("Average of the numbers: " + avr);
    }
}
