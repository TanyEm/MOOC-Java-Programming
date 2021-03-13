import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class GradeStatistic {
    public ArrayList<Integer> gradeList;
    public ArrayList<Integer> passedList;
    
    public GradeStatistic() {
        this.gradeList = new ArrayList<>();
        this.passedList = new ArrayList<>();
    }
    
    public void addGrade(int grade) {
        
        if (grade >= 0 && grade <=100) {
            this.gradeList.add(grade);
            if (grade >= 50) {
                this.passedList.add(grade);
            }
        }
    }
    
    public double getAverageGrade() {
        double sum = 0;
        
        if (this.gradeList.isEmpty()){
            return 0;
        }
        
        for (int i = 0; i < this.gradeList.size(); i++) {
            sum = sum + this.gradeList.get(i);
        }
        
        return sum / this.gradeList.size();
    }
    
    public double passingAverageGrade() {
        double sum = 0;
        
        if (this.passedList.isEmpty()){
            return 0;
        }
        
        for (int i = 0; i < this.passedList.size(); i++) {
            sum = sum + this.passedList.get(i);
        }
        
        return sum / this.passedList.size();
    }
    
    public double getPassPercentage() {
        if (this.passedList.isEmpty()){
            return 0;
        }
        
        if (this.gradeList.isEmpty()){
            return 0;
        }
        
        return 100.0 * this.passedList.size() / this.gradeList.size();
    }
    
    public void getGradeDistribution(int grade) {
        
        if (grade < 0) {
            return;
        }
        
        int count = 0;
        
        for (int i = 0; i < this.gradeList.size(); i++) {
            if (getGrade(this.gradeList.get(i)) == grade) {
                count++;
            }
        }
        
        System.out.print(grade + ": ");
        printStars(count);
    }
    
    private int getGrade(int point) {
        int grade = 0;
        
        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else if (point >= 90) {
            grade = 5;
        }
        
        return grade;
    }
    
    private void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
        System.out.println("");
    }
    
}
