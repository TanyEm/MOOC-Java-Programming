
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class UserInterface {
    private Scanner scan;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.birds = new ArrayList<>();
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scan.nextLine();
            
            boolean isStopped = false;
            
            switch (command) {
                case "Add":
                    add();
                    break;
                case "Observation":
                    addObservation();
                    break;
                case "All":
                    getAll();
                    break;
                case "One":
                    getOne();
                    break;
                case "Quit":
                    isStopped = true;
                    break;
                default:
                    break;
           }
            
            if (isStopped) {
                break;
            }
        }
       
    }
    
    private void add() {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String nameInLatin = scan.nextLine();
                    
        this.birds.add(new Bird(name, nameInLatin));
    }
    
    private void addObservation() {
        System.out.print("Bird? ");
        String name = this.scan.nextLine();
                    
        boolean isFind = false;
                    
        for (Bird bird: this.birds) {
            if (bird.getName().contains(name)){
                bird.setObservations();
                isFind = true;
            }           
        }
        
        if (!isFind) {
            System.out.println("Not a bird!");
        }
    }
    
    private void getAll() {
        if (birds.isEmpty()) {
            return;
        }
        
        for (Bird bird: birds) {
            System.out.println(bird);
        }
    }
    
    private void getOne(){
        System.out.print("Bird? ");
        String name = scan.nextLine();
        
        boolean isFind = false;
        
        for (Bird bird: this.birds) {
            if (bird.getName().contains(name)) {
                System.out.println(bird.toString());
                isFind = true;
            }
        }
        
        if (!isFind) {
            System.out.println("Not a bird!");
        }
    }
    
}
