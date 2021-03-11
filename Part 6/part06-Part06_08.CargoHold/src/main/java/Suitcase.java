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
public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    private int weight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int predictWeight = this.weight + item.getWeight();
        
        if (predictWeight <= maxWeight) {
            this.weight = predictWeight;
            this.items.add(item);
        }
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return "1 item (" + weight + " kg)";
        }
        
        
        return this.items.size() + " items (" + weight + " kg)";
    }
}
