import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class TextUI {
    private Scanner scan;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scan, SimpleDictionary dict) {
        this.scan = scan;
        this.dict = dict;
    }
    
    public void start() {
        
        while(true) {
           System.out.println("Command: ");
            String in = scan.nextLine();
        
            if (in.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (in.equals("add")) {
                addWord();
            } else if (in.equals("search")) {
                searchWord();
            } else {
                System.out.println("Unknown command");
            }        
        }
        
    }
    
    private void addWord() {
        System.out.println("Word: ");
        String word = scan.nextLine();
        System.out.println("Translation: ");
        String translation = scan.nextLine();
        
        dict.add(word, translation);
    }
    
    private void searchWord() {
        System.out.println("To be translated: ");
        String word = scan.nextLine();
        
        if (this.dict.translate(word) != null) {
            System.out.println("Translation: ");
            System.out.println(this.dict.translate(word));
        } else {
            System.out.println("Word " + word + " was not found");
        }
    }
    
}
