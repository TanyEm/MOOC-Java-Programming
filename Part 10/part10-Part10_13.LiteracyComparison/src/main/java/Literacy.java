/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Literacy implements Comparable <Literacy>{
    private final String gender;
    private final String country;
    private final int year;
    private final double percent;
    
    public Literacy(String gender, String country, int year, double percent) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percent = percent;
    }
    
    public double getLiteracyPercent() {
        return this.percent;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public String getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.getYear() + "), " + this.getGender() +
                ", " + this.getLiteracyPercent();
    }

    @Override
    public int compareTo(Literacy arg0) {
        return (this.getLiteracyPercent()-arg0.getLiteracyPercent()) > 0 ? 1 : -1;
    }
}
