/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tanyem
 */
public class AverageSensor implements Sensor {
    
    private List<Sensor> sensorList = new ArrayList();
    private List<Integer> readings = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        this.sensorList.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
    @Override
    public boolean isOn() {
        return this.sensorList.stream().map(Sensor::isOn).allMatch(s -> s == true);
    }

    @Override
    public void setOn() {
        this.sensorList.stream().forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        this.sensorList.stream().forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (this.sensorList.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }
        
        
        
        int reading = (int) this.sensorList.stream()
                .mapToInt(sensor -> sensor.read())
                .average()
                .getAsDouble();
        
        this.readings.add(reading);
        
        return reading;
    }
    
}
