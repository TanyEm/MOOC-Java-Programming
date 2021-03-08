/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard (double openingBalance){
        this.balance = openingBalance;
    }
    
    public String toString() {
        // write code here
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably(){
        
        double lunchCost = 2.60;
        
        if (this.balance >= lunchCost) {
            this.balance = balance - lunchCost;
        }
    }
    
    public void eatHeartily(){
        
        double lunchCost = 4.60;
        
        if (this.balance >= lunchCost) {
            this.balance = balance - lunchCost;
        }
    }
    
    public void addMoney(double amount){
        
        if (amount < 0) {
            return;
        }
        
        double pridictedBalance = this.balance + amount;
        
        if (pridictedBalance >= 150){
            this.balance = 150;
        } else {
            this.balance = pridictedBalance;
        }
        
    }
}
