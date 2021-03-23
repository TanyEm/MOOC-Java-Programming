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
public class Airport {
     private final String airportID;

    public Airport(String id) {
        this.airportID = id;
    }

    @Override
    public String toString() {
        return this.airportID;
    }
}
