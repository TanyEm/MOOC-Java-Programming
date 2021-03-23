/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Plane;
import java.util.Scanner;
import FlightControl.logic.FlightControl;
/**
 *
 * @author tanyem
 */
public class TextUI {
    private final FlightControl flightControl;
    private final Scanner scan;
    
    public TextUI(Scanner scanner) {
        this.scan = scanner;
        this.flightControl = new FlightControl();
    }
    
    public void start() {
        airportAssetControlMenu();
        airportFlightControlMenu();
    }
    
    public void airportAssetControlMenu() {
        while (true) {
            System.out.println("Airport Asset Control");
            System.out.print("Choose an action:\n" +
                "[1] Add an airplane\n" +
                "[2] Add a flight\n" +
                "[x] Exit Airport Asset Control\n" +
                    "> ");
            
            String command = scan.nextLine();
            
            if (command.equals("x")){
                break;
            }
            
            switch (command) {
                case "1":
                    addAirplain();
                    break;
                case "2":
                    addFlight();
                    break;
                default:
                    break;
            }
        }
    }
    
    public void airportFlightControlMenu() {
        while (true) {
            System.out.println("Flight Control");
            System.out.println("Choose an action:\n" +
                "[1] Print airplanes\n" +
                "[2] Print flights\n" +
                "[3] Print airplane details\n" +
                "[x] Quit\n" +
                    "> ");
            
            String command = scan.nextLine();
            
            if (command.equals("x")){
                break;
            }
            
            switch (command) {
                case "1":
                    printPlane();
                    break;
                case "2":
                    printFlight();
                    break;
                case "3":
                    printPlaneByID();
                    break;
                default:
                    break;
            }
        }
    }
    
    public void addAirplain() {
        System.out.println("Give the airplane id: ");
        String planeID = scan.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.valueOf(scan.nextLine());
        
        this.flightControl.addPlane(planeID, capacity);
    }
    
    public void addFlight() {
        System.out.println("Give the airplane id: ");
        Plane planeID = askForAirplane();
        System.out.println("Give the departure airport id: ");
        String departureID = scan.nextLine();
        System.out.println("Give the target airport id: ");
        String targetID = scan.nextLine();
        
        this.flightControl.addFlight(planeID, departureID, targetID);
    }
    
    private Plane askForAirplane() {
        Plane airplane = null;
        while (airplane == null) {
            String id = scan.nextLine();
            airplane = flightControl.getPlane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }
    
    public void printPlane() {
        this.flightControl.getPlanes().stream().forEach(plane -> System.out.println(plane));
    }
    
    public void printPlaneByID() {
        System.out.println("Give the airplane id: ");
        Plane planeID = askForAirplane();
        System.out.println(planeID);
    }
    
    public void printFlight() {
        this.flightControl.getFlights().stream().forEach(flight -> System.out.println(flight));
    }
}
