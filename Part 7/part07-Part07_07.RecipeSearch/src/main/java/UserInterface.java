import java.util.Scanner;
import java.nio.file.Paths;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author tanyem
 */
public class UserInterface {
    private Scanner scan;
    private ArrayList<Recipe> recipes;
    private FileManager fileManager;
    
    public UserInterface(Scanner scan, ArrayList<Recipe> recipes, FileManager fileReader) {
        this.scan = scan;
        this.recipes = recipes;
        this.fileManager = fileReader;
    }
    
    public void start() {
        System.out.print("File to read: ");
        String file = this.scan.nextLine();
        this.recipes = this.fileManager.recipesFromFile(file);
        
        System.out.println("Commands:\n" + 
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient\n");
        
        while (true) {
            System.out.print("Enter command: ");
            String command = this.scan.nextLine();
            
            boolean isStopped = false;
            
            switch (command) {
                case "list":
                    fileManager.printRecipes(recipes);
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String word = this.scan.nextLine();
                    fileManager.findByTitle(recipes, word);
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int time = Integer.valueOf(this.scan.nextLine());
                    fileManager.findByCookingTime(recipes, time);
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = this.scan.nextLine();
                    fileManager.findByIngridient(recipes, ingredient);
                    break;
                case "stop":
                    isStopped = true;
                    break;
                default:
                    break;
           }
            
            if (isStopped) {
                break;
            }
        }  
    }  
}
