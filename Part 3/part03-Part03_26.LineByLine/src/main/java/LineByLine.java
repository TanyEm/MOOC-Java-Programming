
import java.util.Scanner;

public class LineByLine {

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
            System.out.println(seporatedText[i]);
        }
            
    }
}
