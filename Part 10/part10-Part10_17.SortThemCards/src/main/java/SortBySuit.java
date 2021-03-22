import java.util.Comparator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class SortBySuit implements Comparator <Card> {

    @Override
    public int compare(Card arg0, Card arg1) {
        return arg0.getSuit().ordinal() - arg1.getSuit().ordinal();
    }

    
}
