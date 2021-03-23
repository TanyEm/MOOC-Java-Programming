/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import java.util.HashMap;
import java.util.Collection;
import FlightControl.domain.Flight;
import FlightControl.domain.Plane;
import FlightControl.domain.Airport;
/**
 *
 * @author tanyem
 */
public class FlightControl {
    private final HashMap<String, Airport> airports;
    private final HashMap<String, Plane> planes;
    private HashMap<String, Flight> flights;
    
    public FlightControl() {
        this.flights = new HashMap<>();
        this.planes = new HashMap<>();
        this.airports = new HashMap<>();
    }
    
    public void addPlane(String id, int capacity) {
        Plane plane = new Plane(id, capacity);
        this.planes.putIfAbsent(id, plane);
    }
    
    public void addFlight(Plane plane, String departureID, String destinationID) {
        this.airports.putIfAbsent(departureID, new Airport(departureID));
        this.airports.putIfAbsent(destinationID, new Airport(destinationID));
        
        Flight flight = new Flight(plane, this.airports.get(departureID), this.airports.get(destinationID));
        
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Plane> getPlanes() {
        return this.planes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Plane getPlane(String ID) {
        return this.planes.get(ID);
    }
}
