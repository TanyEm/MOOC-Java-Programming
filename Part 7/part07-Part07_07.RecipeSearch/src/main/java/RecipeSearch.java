import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Recipe> recipeManager = new ArrayList<>();
        FileManager fileReader = new FileManager();
        
        UserInterface ui = new UserInterface(scanner, recipeManager,fileReader);
        ui.start();
    }
}
