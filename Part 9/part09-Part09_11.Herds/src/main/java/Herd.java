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
public class Herd implements Movable {
    
    private ArrayList <Movable> herds;
    
    public Herd() {
        this.herds = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herds) {
            movable.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String out = "";
        for (Movable movable : this.herds) {
            out += movable.toString()+"\n";
        }
        return out;
    }
    
}
