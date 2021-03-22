import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Hand implements Comparable<Hand>{
    private ArrayList <Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        this.hand.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    private int totalInHand() {
        Iterator<Card> iterator = this.hand.iterator();
        int sum = 0;
        
        while (iterator.hasNext()) {
            sum += iterator.next().getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand arg0) {
        return this.totalInHand() - arg0.totalInHand();
    }
    
    public void sortBySuit() {

        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);
        Collections.sort(this.hand, comparator);
    }
}
