
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scan.nextLine());
        
        String result = "";
        
        if (points < 0){
            result = "impossible!";
        } else if (points <= 49) {
            result = "failed";
        } else if (points <= 59) {
            result = "1";
        } else if (points <= 69) {
            result = "2";
        } else if (points <= 79) {
            result = "3";
        } else if (points <= 89) {
            result = "4";
        } else if (points <= 100) {
            result = "5";
        } else if (points > 100) {
            result = "incredible!";
        }
        
        System.out.println("Grade: " + result);
    }
}
