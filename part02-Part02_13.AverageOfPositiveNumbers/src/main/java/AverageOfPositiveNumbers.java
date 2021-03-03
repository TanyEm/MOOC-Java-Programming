
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            double in = Double.valueOf(scanner.nextLine());
            
            if (in == 0) {
                break;
            }
            
            if (in > 0){
                count = count + 1;
                sum = sum + in;
            }
        }
        
        double avr = sum / count;
        
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else { 
            System.out.println(avr);
        }
    }
}
