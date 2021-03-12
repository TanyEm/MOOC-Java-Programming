
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int maxSize = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + maxSize);
            System.out.println("Second: " + secondContainer + "/" + maxSize);
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
                        
            switch (command) {
                case "add": 
                    if (amount < 0) {
                       break; 
                    }
                    firstContainer += amount;
                    if (firstContainer > maxSize){
                        firstContainer = maxSize;
                    }
                    break;
                case "move":
                    if (amount < 0) {
                       break; 
                    }
                    
                    if (firstContainer - amount >= 0) {
                        firstContainer -= amount;
                        secondContainer += amount;
                    } else if (amount > firstContainer) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    }
                    
                    if (secondContainer > maxSize) {
                        secondContainer = maxSize;
                    }
                    
                    break;
                case "remove":
                    if (amount < 0 || secondContainer == 0) {
                       break; 
                    }
                    
                    if (secondContainer - amount < 0) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= amount;
                    }
                    
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }

}
