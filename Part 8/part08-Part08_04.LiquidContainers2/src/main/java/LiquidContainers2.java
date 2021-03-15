
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] in = input.split(" ");
            int amount = Integer.valueOf(in[1]);
            
            switch (in[0]) {
                case "add":
                    container1.add(amount);
                    break;
                case "move":
                    int first = container1.contains();
                    if (first == 0) {
                        break;
                    }
                    if (amount > first){
                        container1.remove(amount);
                        container2.add(first);
                    } else {
                        container1.remove(amount);
                        container2.add(amount);
                    }
                    
                    break;
                case "remove":
                    container2.remove(amount);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }

        }
    }

}
