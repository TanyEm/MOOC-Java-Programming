/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author tanyem
 */
public class Plane {
    private final String planeID;
    private final int capacityOfSeats;
    
    public Plane(String id, int capacity) {
        this.planeID = id;
        this.capacityOfSeats = capacity;
    }
    
    public int getCapacityOfSeats() {
        return this.capacityOfSeats;
    }
    
    public String getPlaneID() {
        return this.planeID;
    }
    
    @Override
    public String toString() {
        return this.planeID + " (" + this.capacityOfSeats + " capacity)";
    }
    
    @Override
    public boolean equals(Object obj) {
        Plane match = (Plane) obj;
        return this.planeID.equals(match.getPlaneID())&&this.capacityOfSeats==match.getCapacityOfSeats(); 
    }
    
    @Override
    public int hashCode() {
        return this.planeID.toUpperCase().hashCode();
    }
}
