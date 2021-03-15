
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] in = input.split(" ");
            int amount = Integer.valueOf(in[1]);
            
            switch (in[0]) {
                case "add":
                    
                    if (amount > 0) {
                        first += amount;
                    }
                    
                    if (first > 100) {
                        first = 100;
                    }
                    
                    break;
                case "move":
                    
                    if (first <= 0) {
                        break;
                    }
                    
                    if (first < amount) {
                        second += first;
                        first = 0;
                    } else {
                        first -= amount;
                        second += amount;
                    }
                    
                    if (second > 100) {
                        second = 100;
                    }
                    
                    break;
                case "remove":
                    if (amount <= 0) {
                        break;
                    }
                    
                    if (amount > second) {
                        second = 0;
                    } else {
                        second -= amount;
                    }
                    
                    break;
            }

        }
    }

}
