/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Container {
    private int container;
    private int maxAmount;
    
    public Container() {
        this.container = 0;
        this.maxAmount = 100;
    }
    
    public int contains() {
        return this.container;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.container += amount;
        }
                    
        if (this.container > maxAmount) {
            this.container = maxAmount;
        }
    }
    
    
    public void remove(int amount) {
        if (amount <= 0) {
            return;
        }
                    
        if (amount > this.container) {
            this.container = 0;
        } else {
            this.container -= amount;
        }
    }
    
    public String toString() {
        return contains() + "/" + this.maxAmount;
    }
    
}
