/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Cube {
    private int edgeLength;
    private int volume;
    
    public Cube (int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume() {
        
        this.volume = this.edgeLength * this.edgeLength * this.edgeLength;
        
        return this.volume;
    }
    
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + volume();
    }
}
