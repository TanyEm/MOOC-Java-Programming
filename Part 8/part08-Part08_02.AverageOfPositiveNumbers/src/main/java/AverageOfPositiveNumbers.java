import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while(true){
            int in = Integer.valueOf(scanner.nextLine());
            
            if (in == 0) {
                break;
            }
            
            if (in > 0) {
                sum += in;
                count += 1;
            }
        }
        
        if (count == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }
        
        System.out.println(1.0 * sum / count);
        
    }
}
