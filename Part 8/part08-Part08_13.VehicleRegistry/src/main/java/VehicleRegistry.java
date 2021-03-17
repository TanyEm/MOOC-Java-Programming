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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registrations;
    
    public VehicleRegistry(){
        this.registrations = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registrations.containsKey(licensePlate)) {
            return false;
        }
        
        this.registrations.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        if (!this.registrations.containsKey(licensePlate)) {
            return null;
        }
        
        return this.registrations.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!this.registrations.containsKey(licensePlate)) {
            return false;
        }
        
        this.registrations.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate license: this.registrations.keySet()) {
            System.out.println(license);
        }
    }
    
    public void printOwners() {
        
        ArrayList<String> owners = new ArrayList<>();
        
        for (String license: this.registrations.values()) {
            if (owners.contains(license)) {
                continue;
            }
            owners.add(license);
        }
        
        for (String owner: owners) {
            System.out.println(owner);
        }
    }
}
