/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class MisplacingBox extends Box {
    
    private Item Misplceditem;
    
    public MisplacingBox() {
        this.Misplceditem = null;
    }

    @Override
    public void add(Item item) {
        this.Misplceditem = item;
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
