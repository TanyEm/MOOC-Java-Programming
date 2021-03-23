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
public class Flight {
    private final Airport departureAirport;
    private final Airport destinationAirport;
    private final Plane plane;
    
    public Flight(Plane plane, Airport departureAirport, Airport destinationAirport) {
        this.plane = plane;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }
    
    public String getPlaneID() {
        return this.plane.toString();
    }
    
    public String getDepartureAirport() {
        return this.departureAirport.toString();
    }
    
    public String getDestinationAirport() {
        return this.destinationAirport.toString();
    }
    
    @Override
    public String toString() {
        return this.getPlaneID() + " (" + this.getDepartureAirport() + "-" + this.getDestinationAirport() + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        Flight match = (Flight) obj;
        return this.departureAirport.equals(match.getDepartureAirport()) 
                && this.plane.equals(match.plane)
                && this.destinationAirport.equals(match.getDestinationAirport()); 
    }
    
    @Override
    public int hashCode() {
        return this.plane.hashCode();
    }
}
