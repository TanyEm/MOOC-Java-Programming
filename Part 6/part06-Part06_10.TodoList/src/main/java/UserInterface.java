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
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scan = scanner;
    }
    
    public void start() {
        while(true) {
           System.out.println("Command: ");
            String in = scan.nextLine();
            
            boolean isStopped = false;
            
            switch (in) {
                case "stop": 
                    System.out.println("Bye bye!");
                    isStopped = true;
                    break;
                case "add": 
                    addTask();
                    break;
                case "list": 
                    getList();
                    break;
                case "remove": 
                    removeTask();
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
            
            if (isStopped) {
                break;
            }
        }
    }
    
    private void addTask() {
        System.out.println("To add:");
        String in = scan.nextLine();
        list.add(in);
    }
    
    private void getList() {
        list.print();
    }
    
    private void removeTask() {
        System.out.println("Which one is removed?");
        int in = Integer.valueOf(scan.nextLine());
        list.remove(in);
    }
}
