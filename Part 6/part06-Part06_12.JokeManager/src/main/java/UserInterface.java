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
    private JokeManager manager;
    private Scanner scan;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scan = scanner;
    }
    
    public void start() {
        while (true) {
            printComands();
            String in = scan.nextLine();
            
            boolean isStopped = false;
            
            switch (in) {
                case "1":
                    addJoke();
                    break;
                case "2":
                    drawJoke();
                    break;
                case "3":
                    printJokes();
                    break;
                case "X":
                    isStopped = true;
                    break;
            }
            
            if (isStopped) {
                break;
            }
        }
    }
    
    public void printComands() {
        System.out.println("Commands:\n" +
            "1 - add a joke\n" +
            "2 - draw a joke\n" +
            "3 - list jokes\n" +
            "X - stop");
    }
    
    private void addJoke() {
        System.out.println("Write the joke to be added:");
        String in = scan.nextLine();
        this.manager.addJoke(in);
    }
    
    private void drawJoke() {
        System.out.println(this.manager.drawJoke());
    }
    
    private void printJokes() {
        System.out.println("Printing the jokes.");
        this.manager.printJokes();
    }
}
