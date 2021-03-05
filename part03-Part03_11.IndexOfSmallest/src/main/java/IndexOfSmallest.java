
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList <Integer> list = new ArrayList();
        
        while (true) {
            int in = Integer.valueOf(scanner.nextLine());
            
            if (in == 9999) {
                break;
            }
            list.add(in);
        }
        
        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++){
            if (smallest >  list.get(i)){
                smallest = list.get(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println(smallest + " is at index " + i);
            }
        }
    }
}