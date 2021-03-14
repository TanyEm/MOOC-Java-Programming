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
public class Bird {
    private String name;
    private String nameInLatin;
    private int countOfObservations;
    private ArrayList<String> birds;
    
    public Bird(String name, String nameInLatin){
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.countOfObservations = 0;
        this.birds = new ArrayList<>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getNameInLatin() {
        return this.nameInLatin;
    }
    
    public int getCountOfObservations(){
        return this.countOfObservations;
    }
    
    public void setObservations() {
        this.countOfObservations += 1;
    }
    
    public ArrayList<String> getListOfBirds() {
        return this.birds;
    }
    
    @Override
    public String toString() {

            return getName() + "(" + getNameInLatin() + "): " + getCountOfObservations() + " observations";
    }
}
