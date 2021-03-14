import java.nio.file.Paths;
import java.util.ArrayList;
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
public class FileManager {
    private ArrayList<Recipe> file;
    ArrayList<String> fileParts;
    private String fileName;
    
    public FileManager() {
//        this.fileName = fileName;
        this.file = new ArrayList<>();
        this.fileParts = new ArrayList<>();
    }
    
    public ArrayList<Recipe> recipesFromFile(String pathFile) {
        String name;
        int time;
        
        try (Scanner getFile = new Scanner(Paths.get(pathFile))) {
            while (getFile.hasNextLine()) {
                String line = getFile.nextLine();

                //adding all the readable lines to our arraylist
                if (!line.isEmpty()) {
                    fileParts.add(line);
                } else {
                    //Once the line is empty, extract the first two lines

                    name = fileParts.get(0);
                    time = Integer.valueOf(fileParts.get(1));

                    //remove the remaining lines
                    fileParts.remove(0);
                    fileParts.remove(0);
                    //Add to the Recipe list using constructor
                    file.add(new Recipe(name, time, fileParts));
                    fileParts.clear();
                }

            }
            //while recipeParts list is not empty 
            if (!fileParts.isEmpty()) {
                //get the first two lines
                name = fileParts.get(0);
                time = Integer.valueOf(fileParts.get(1));
                
                //remove the remaining lines
                fileParts.remove(0);
                fileParts.remove(0);
                
                
                file.add(new Recipe(name, time, fileParts));
                fileParts.clear();

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return file;
    }
    
    public void printRecipes(ArrayList<Recipe> recipes) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString());
        }
        System.out.println("");
    }
    
    public void findByTitle(ArrayList<Recipe> recipes, String title) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getTitle().contains(title)) {
                System.out.println(recipe.toString());
            }
        }
        System.out.println("");
    }
    
    public void findByCookingTime(ArrayList<Recipe> recipes, int time) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe.toString());
            }
        }
        System.out.println("");
    }
    
    public void findByIngridient(ArrayList<Recipe> recipes, String ingredient){
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe.toString());
            }
        }
        System.out.println("");
    }
    
}
