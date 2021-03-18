/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory history;
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double oldBalance = this.getBalance();
        double decriment = super.takeFromWarehouse(amount);
        
        if (amount > oldBalance) {
            decriment = 0;
        }
        
        double newBalance = oldBalance - decriment;
        this.history.add(newBalance);
        
        return newBalance;
    }
    
    public String history() {
        return this.history.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName() +
                "\nHistory: " + this.history() +
                "\nLargest amount of product: " + this.history.maxValue() +
                "\nSmallest amount of product: " + this.history.minValue() +
                "\nAverage: " + this.history.average());
    }
}
