
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String in = scanner.nextLine();
            
            if (in.equals("")){
                break;
            }
            
            printSeporatedText(in);
        }
    }
    
    public static void printSeporatedText(String str) {
        
        String[] seporatedText = str.split(" ");
        
        for (int i = 0; i < seporatedText.length; i++) {
            if (seporatedText[i].contains("av")){
                System.out.println(seporatedText[i]);
            }
        }
            
    }
}
