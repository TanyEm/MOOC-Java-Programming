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
public class BySuitInValueOrder implements Comparator <Card>{

    @Override
    public int compare(Card first, Card second) {
        if (first.getSuit() == second.getSuit()) {
            return first.compareTo(second);
        }
        return new SortBySuit().compare(first, second);
    }
    
}
