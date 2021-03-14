import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Recipe {
    private String title;
    private int time;
    private ArrayList<String> recipeList = new ArrayList<>();
    
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.title = name;
        this.time = time;

        for (String ingredient: ingredients) {
            this.recipeList.add(ingredient);
        }
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getCookingTime() {
        return this.time;
    }
    
    public ArrayList<String> getIngredients() {
        return this.recipeList;
    }

    @Override
    public String toString() {
        return this.getTitle() + ", cooking time: " + this.getCookingTime();
    }
}
