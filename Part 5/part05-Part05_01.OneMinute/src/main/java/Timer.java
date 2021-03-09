/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Timer {
    private ClockHand hundredthsOfASecond;
    private ClockHand second;
    
    public Timer() {
        this.hundredthsOfASecond = new ClockHand(100);
        this.second = new ClockHand(60);
    }
    
    public void advance() {
        this.hundredthsOfASecond.advance();
        
        if (this.hundredthsOfASecond.value() == 0) {
            this.second.advance();
        }
    }
    
    public String toString() {
        return this.second + ":" + this.hundredthsOfASecond;
    }
}
