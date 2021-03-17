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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList <String>> dict;
    
    public DictionaryOfManyTranslations() {
        this.dict = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        // create new key with empty ArrayList
        this.dict.putIfAbsent(word, new ArrayList<>());
        
        // than add first value to the ArrayList value 
        // find by key and than add value to Array with add()
        this.dict.get(word).add(translation);

    }
    
    public ArrayList<String> translate(String word) {
        
        return this.dict.getOrDefault(word, new ArrayList <>());
    }
    
    public void remove(String word) {
        this.dict.remove(word);
    }
}
