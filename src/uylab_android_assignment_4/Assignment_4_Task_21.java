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
public class Assignment_4_Task_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads a student’s mark for a single subject, and prints out the
        corresponding grade for that mark. The mark ranges and corresponding grades are shown in the table
        below.

        Marks          Grade
        90 and above     A
        80-89            B
        70-79            C
        60-69            D
        50-59            E
        Below 50         F
        */
        
        System.out.println("Enter mark for a single subject: ");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        
        if (mark >= 90) {
            System.out.println("Result: Grade 'A'");
        }
        
        else if (mark >= 80 && mark <= 89) {
            System.out.println("Result: Grade 'B'");
        }
        
        else if (mark >= 70 && mark <= 79) {
            System.out.println("Result: Grade 'C'");
        }
        
        else if (mark >= 60 && mark <= 69) {
            System.out.println("Result: Grade 'D'");
        }

        else if (mark >= 50 && mark <= 59) {
            System.out.println("Result: Grade 'E'");
        }

        else if (mark < 50) {
            System.out.println("Result: Grade 'F'");
        }

        
    }
    
}
