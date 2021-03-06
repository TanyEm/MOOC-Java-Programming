
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        String in = scanner.nextLine();
        
        int index = 3;
        String phrase = "";
        
        for (int i = 1; i <= index; i++){
            phrase = phrase + in;
        }
        System.out.println(phrase);
    }
}
