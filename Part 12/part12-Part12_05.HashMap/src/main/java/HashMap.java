/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 *
 * @author tanyem
 */
public class HashMap<K, V> {
    private ArrayList<Pair<K, V>>[] values;
    private int hashNumber;
    
    public HashMap() {
        this.values = new ArrayList[32];
        this.hashNumber = 32;
    }
    
    public void add(K key, V value) {
        int hashF = hashFunction(key);
        
        if(values[hashF] == null) {
            values[hashF] = new ArrayList<Pair<K,V>>();
        }
        
        if(values[hashF].size() == 100) {
            this.doubleHashMap();
        }
        
        values[hashF].add(new Pair(key, value));
    }
    
    public void removeFromKey(K key) {
        int hashF = hashFunction(key);
        
        for(Pair pair : this.values[hashF]) {
            if(pair.getKey().equals(key)) {
                this.values[hashF].remove(pair);
            }
        }
    }
    
    public V getValue(K key) {
        int hashF = hashFunction(key);
        
        for(Pair pair : this.values[hashF]) {
            if(pair.getKey().equals(key)) {
                return (V)pair.getValue();
            }
        }
        
        return null;
    }
    
    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = hashFunction(key);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }

        return values[hashValue];
    }
    
    private void doubleHashMap() {
        ArrayList<Pair<K,V>>[] oldHashMap = this.values;
        
        this.values = new ArrayList[this.hashNumber*2];
        this.hashNumber*=2;
        
        for(ArrayList<Pair<K,V>> list: oldHashMap) {
            for(Pair<K,V> pair: list) {
                this.add(pair.getKey(), pair.getValue());
            }
        }
    }
    
    public int hashFunction (K key) {
        return Math.abs(key.hashCode() % this.hashNumber);
    }
    
}
