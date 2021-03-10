/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Archive {
    
    private String id;
    private String name;
    
    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getId(){
        return this.id;
    }
    
    public boolean equals(Object compared){
        Archive comparedBook = (Archive) compared;
        
        return comparedBook.id.equals(this.id);
    }
    
    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
}
