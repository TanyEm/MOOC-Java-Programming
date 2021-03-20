import java.util.List;
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
public class ShoppingCart {
    private List<Item> carts;
    
    public ShoppingCart() {
        this.carts = new ArrayList<>();
    } 
    
    public void add(String product, int price) {
        
        for (Item item: carts) {
            if (item.getProduct().equals(product)) {
                item.increaseQuantity();
                return;
            }
        }
        
        this.carts.add(new Item(product, 1, price));
    }
    
    public int price() {
        
        if (this.carts.isEmpty()) {
            return 0;
        }
        
        int sum = 0;
        
        for (Item item: carts) {
            sum += item.price();
        }
        
        return sum;
    }
    
    public void print() {
        
        for (Item item: carts) {
            System.out.println(item);
        }
        
    }
}
