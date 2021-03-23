/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author tanyem
 */
public class Pair {
    private String key;
    private String value;
    
    public Pair(String key, String value) {
        this.key = key;
        this.value = value;
    }
    
    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }
    
    public Pair(String key) {
        String[] pair = key.split(":");
        this.key = pair[0];
        this.value = pair[1];
    }
    
    @Override
    public String toString() {
        return key + ":" + value;
    }
}
