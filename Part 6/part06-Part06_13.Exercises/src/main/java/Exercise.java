/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Exercise {
    private String task;
    private boolean completed;
    
    public Exercise(String task) {
        this.task = task;
        this.completed = false;
    }
    
    public String getName() {
        return this.task;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public boolean isCompleted(){
        return this.completed;
    }
    
}
