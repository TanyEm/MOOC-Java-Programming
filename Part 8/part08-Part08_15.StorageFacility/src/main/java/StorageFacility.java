import java.util.HashMap;
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> facilities;
    
    public StorageFacility() {
        this.facilities = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.facilities.putIfAbsent(unit, new ArrayList<>());
        this.facilities.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.facilities.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        this.facilities.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> listOfUnits = new ArrayList<String>();
        
        for (String unit : this.facilities.keySet()){
            if (this.facilities.get(unit).size() != 0){
                listOfUnits.add(unit);
            }
        }
        return listOfUnits;
    }
}
