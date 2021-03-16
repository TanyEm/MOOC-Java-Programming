import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class IOU {
    private HashMap <String, Double> debtors;
    
    public IOU() {
        this.debtors = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.debtors.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (this.debtors.containsKey(toWhom)) {
            return this.debtors.get(toWhom);
        }
        return 0.0;
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
