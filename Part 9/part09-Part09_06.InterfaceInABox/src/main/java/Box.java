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
public class Box implements Packable {
    
    private double maxCapacity;
    private ArrayList<Packable> box;
    
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.box = new ArrayList<>();
    }

    @Override
    public double weight() {
        double weight = 0.0;
        
        for (Packable item: box) {
            weight += item.weight();
        }
        
        return weight;
    }
    
    public void add(Packable item) {
        if (item.weight() + this.weight() < this.maxCapacity) {
            box.add(item);
            this.weight();
        }
    }
    
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
    
    public void addBox(Box box) {
        if (box.weight() + this.weight() < this.maxCapacity){
            this.box.add(box);
        }
    }
    
}
