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
public class BoxWithMaxWeight extends Box {
    
    private final int capacity;
    private ArrayList <Item> box;
    private int fullness;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<>();
        this.fullness = fullness;
    }
    
    @Override
    public void add(Item item) {
        if (this.capacity >= this.fullness + item.getWeight() && item.getWeight() >= 0) {
            this.box.add(item);
            this.fullness += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.box.contains(item);
    }
    
}
