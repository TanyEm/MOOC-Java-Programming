/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 *
 * @author tanyem
 */
public class SaveableDictionary {
    
    private List<Pair> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new ArrayList<>();
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new ArrayList<>();
        this.file = file;
    }
    
    public void add(String words, String translation) {
        if (this.dictionary.contains(words) || this.dictionary.contains(translation)) {
            return;
        }
        this.dictionary.add(new Pair(words, translation));
    }
    
    public String translate(String word) {
        for (Pair item : dictionary) {
            if (item.getKey().equalsIgnoreCase(word)) {
                return item.getValue();
            } else if (item.getValue().equalsIgnoreCase(word)) {
                return item.getKey();
            }
        }
        
        return null;
    }
    
    public void delete(String word) {
        for (Pair item : dictionary) {
            if (item.getKey().equalsIgnoreCase(word)) {
                this.dictionary.remove(item);
                break;
            } else if (item.getValue().equalsIgnoreCase(word)) {
                this.dictionary.remove(item);
                break;
            }
        }
    }
    
    public boolean load() {
        
        try (Scanner sc = new Scanner(Paths.get(file))){
            while (sc.hasNext()) {
                dictionary.add(new Pair(sc.nextLine()));
            }
        } catch (IOException e) {
            return false;
        }
        
        return true;
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(file)){
            for (Pair wp : dictionary) {
                writer.println(wp);
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            return false;
        }
        
        return true;
    }
}
