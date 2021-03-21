
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ints = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String in = scanner.nextLine();
            
            if (in.equals("end")) {
                break;
            }
            
            ints.add(in);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String command = scanner.nextLine();
        
        switch (command) {
            case "n":
                getAverage(ints, command);
                break;
            case "p":
                getAverage(ints, command);
                break;
            default:
                break;
        }
    }
    
    public static void getAverage(ArrayList <String> stream, String command) {
        
        double avr = 0.0;
        
        if (command.equals("p")) {
            avr = stream.stream()
                .mapToInt(in -> Integer.valueOf(in))
                .filter(in -> in > 0)
                .average()
                .getAsDouble();
        
            System.out.println("Average of the positive numbers: " + avr);
        } else if (command.equals("n")) {
            avr = stream.stream()
                .mapToInt(in -> Integer.valueOf(in))
                .filter(in -> in < 0)
                .average()
                .getAsDouble();
        
            System.out.println("Average of the negative numbers: " + avr);
        }
    }
}
