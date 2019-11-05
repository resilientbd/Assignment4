/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uylab_android_assignment_4;

import java.util.Scanner;

/**
 *
 * @author RIYAD Patwary
 */
public class Assignment_4_Task_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code that takes as input your final marks and shows as output the letter grade.
        90 - 100     = A (4.0) Excellent
        85 - <90     = A- (3.7)
        80 - <85     = B+ (3.3)
        75 - <80     = B (3.0) Good
        70 - <75     = B- (2.7)
        65 - <70     = C+ (2.3)
        60 - <65     = C (2.0) Fair
        57 - <60     = C- (1.7)
        55 - <57     = D+ (1.3)
        52 - <55     = D (1.0) Poor
        50 - <52     = D- (0.7)
        <50          = F (0.0) Failure
        */
        
        System.out.println("Enter mark to know your letter Grade: ");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        
        if (mark >= 90 && mark <= 100) {
            System.out.println("Your Grade is 'A' (4.0) Excellent");
        }
        
        else if (mark >= 85 && mark < 90) {
            System.out.println("Your Grade is 'A-' (3.7)");
        }
        
        else if (mark >= 80 && mark < 85) {
            System.out.println("Your Grade is 'B+' (3.3)");
        }
        
        else if (mark >= 75 && mark < 80) {
            System.out.println("Your Grade is 'B' (3.0) Good");
        }
        
        else if (mark >= 70 && mark < 75) {
            System.out.println("Your Grade is 'B-' (2.7) ");
        }
        
        else if (mark >= 65 && mark < 70) {
            System.out.println("Your Grade is 'C+' (2.3) ");
        }
       
        else if (mark >= 60 && mark < 65) {
            System.out.println("Your Grade is 'C' (2.0) Fair");
        }
        
        else if (mark >= 57 && mark < 60) {
            System.out.println("Your Grade is 'C-' (1.7) ");
        }
        
        else if (mark >= 55 && mark < 57) {
            System.out.println("Your Grade is 'D+' (1.3) ");
        }
        
        else if (mark >= 52 && mark < 55) {
            System.out.println("Your Grade is 'D' (1.0) Poor");
        }
        
        else if (mark >= 50 && mark < 52) {
            System.out.println("Your Grade is 'D-' (0.7) ");
        }
        
        else if (mark < 50) {
            System.out.println("Your Grade is 'F' (0.0) Failure");
        }
    }
    
}
