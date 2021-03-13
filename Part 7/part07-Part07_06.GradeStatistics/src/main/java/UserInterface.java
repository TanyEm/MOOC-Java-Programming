import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class UserInterface {
    private Scanner scan;
    private GradeStatistic statistic;
    
    public UserInterface(Scanner scan, GradeStatistic statistic) {
        this.scan = scan;
        this.statistic = statistic;
    }
    
    public void start() {
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int in = Integer.valueOf(scan.nextLine());
            
            if (in == -1) {
                break;
            }
            
            statistic.addGrade(in);
        }
        
        System.out.println("Point average (all): " + statistic.getAverageGrade());
        getPassedAverageGrade();
        System.out.println("Pass percentage: " + statistic.getPassPercentage());
        System.out.println("Grade distribution:");
        statistic.getGradeDistribution(5);
        statistic.getGradeDistribution(4);
        statistic.getGradeDistribution(3);
        statistic.getGradeDistribution(2);
        statistic.getGradeDistribution(1);
        statistic.getGradeDistribution(0);
        
    }
    
    public void getPassedAverageGrade() {
        
        if (this.statistic.passingAverageGrade() == 0.00) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + statistic.passingAverageGrade());
        } 
    }
    
}
