/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
/**
 *
 * @author tanyem
 */
public class TemperatureSensor implements Sensor {
    
    private boolean sensor;
    
    
    public TemperatureSensor() {
        this.sensor = false;
    }

    @Override
    public boolean isOn() {
        if (this.sensor) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        this.sensor = true;
    }

    @Override
    public void setOff() {
        this.sensor = false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException(); 
        }
        return new Random().nextInt(30 + 30) - 30;
    }
    
}
