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
public class Room {
    
    private ArrayList<Person> roomers;
    
    public Room() {
        this.roomers = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.roomers.add(person);
    }
    
    public boolean isEmpty() {
        return roomers.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return roomers;
    }
    
    public Person shortest() {
        if (this.roomers.isEmpty()) {
            return null;
        }
        
        Person returnValue = this.roomers.get(0);
        
        for (Person roomer: roomers) {
            if (returnValue.getHeight() > roomer.getHeight()) {
                returnValue = roomer;
            }
        }
        
        return returnValue;
    }
    
    public Person take() {
        if (this.roomers.isEmpty()) {
            return null;
        }
        
        Person shortest = shortest();
        roomers.remove(shortest);
        
        return shortest;
    }
}
