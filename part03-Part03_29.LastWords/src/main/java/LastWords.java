
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String in = scanner.nextLine();
            
            if (in.equals("")){
                break;
            }
            
            String[] str = in.split(" ");
            System.out.println(str[str.length - 1]);
        }
    }
}
