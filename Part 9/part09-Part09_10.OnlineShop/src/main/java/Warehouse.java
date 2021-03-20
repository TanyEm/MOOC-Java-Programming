import java.util.Map;
import java.util.HashMap;
import java.util.Set;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Warehouse {
    
    private Map<String, Integer> productsPrice  = new HashMap<>();
    private Map<String, Integer> productsStock  = new HashMap<>();
    
    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }
    
    public int price(String product) {
        return this.productsPrice.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.productsStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        
        if (!this.productsStock.containsKey(product)) {
            return false;
        }
        
        if (this.productsStock.get(product) <= 0) {
            return false;
        }
        
        if (this.productsStock.containsKey(product)) {
            int oldStock = this.productsStock.get(product);
            this.productsStock.replace(product, --oldStock);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set <String> products = this.productsStock.keySet();
        return products;
    }
}
