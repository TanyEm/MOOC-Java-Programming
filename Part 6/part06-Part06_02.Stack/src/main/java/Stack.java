
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
public class Stack {
    
    private ArrayList<String> values;
    
    public Stack() {
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return values.isEmpty();
    }
    
    public void add(String value) {
        values.add(value);
    }
    
    public ArrayList<String> values() {
        return values;
    }
    
    public String take() {
        String lastValue = values.get(values.size() - 1);
        values.remove(lastValue);
        return lastValue;
    }
}
