/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author tanyem
 */
public class SavingsAccount {
    private double balance;
    private double balanceWithoutInterest;
    private double monthlyRecord;
    private double interestRate;

    public SavingsAccount(double monthlyRecord, double interestRate) {
        this.monthlyRecord = monthlyRecord;
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public double getMonthlyRecord() {
        return this.monthlyRecord;
    }

    public void increaseYear() {
        this.balance += 12 * this.monthlyRecord;
        this.balance += 1.0 * this.balance * (this.interestRate / 100);
        this.balanceWithoutInterest += 12 * this.monthlyRecord;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getBalanceWithoutInterest() {
        return this.balanceWithoutInterest;
    }

    public void setInterestRate(double rate) {
        this.balance = 0;
        this.interestRate = rate;
        this.balanceWithoutInterest = 0;
    }

    public void setMonthlyRecord(double monthlyRecord) {
        this.balance = 0;
        this.monthlyRecord = monthlyRecord;
        this.balanceWithoutInterest = 0;
    }
}
