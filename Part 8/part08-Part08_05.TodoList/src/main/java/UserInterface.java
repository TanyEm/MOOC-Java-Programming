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
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scan) {
        this.scan = scan;
        this.todoList = todoList;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            
            String input = scan.nextLine();
            boolean isStopped = false;
            
            switch (input) {
                case "add":
                    System.out.print("Task: ");
                    String task = scan.nextLine();
                    this.todoList.add(task);
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int number = Integer.valueOf(scan.nextLine());
                    this.todoList.remove(number);
                    break;
                case "stop":
                    isStopped = true;
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
    
}
