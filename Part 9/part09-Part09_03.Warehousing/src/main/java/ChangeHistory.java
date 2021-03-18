import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public double maxValue() {
        emptyArray();
        double max = this.history.get(0);
        for (Double item: this.history) {
            if (max < item){
                max = item;
            }
        }
        
        return max;
    }
    
    public double minValue() {
        emptyArray();
        double min = this.history.get(0);
        for (Double item: this.history) {
            if (min > item){
                min = item;
            }
        }
        return min;
    }
    
    public double average() {
        emptyArray();
        double sum = 0;
        for (Double item: this.history) {
            sum += item;
        }
 
        return sum / (this.history.size());
    }
    
    private void emptyArray() {
        if (this.history.isEmpty()) {
            return;
        }
    }
    
    @Override
    public String toString() {
        return this.history.toString();
    }
}
