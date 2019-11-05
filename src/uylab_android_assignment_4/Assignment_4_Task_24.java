/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uylab_android_assignment_4;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 *
 * @author RIYAD Patwary
 */
public class Assignment_4_Task_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code for a program that performs four functions of a calculator. The program should
        request the user to enter a floating-point number, an operator and another floating-point number. It
        should then carry out the specified arithmetical operation: adding, subtracting, multiplying, or dividing the
        two floating-point numbers. Finally, it should display the result.
        */
        
        
        //scanner for float input
        Scanner floatScanner=new Scanner(System.in);
        
        //float input
        System.out.println("Enter a floating point number: ");
        float myFloat1=floatScanner.nextFloat();
        
        //float input
        System.out.println("Enter another floating point number: ");
        float myFloat2=floatScanner.nextFloat();
        
        //scanner for character input
        Scanner charScanner=new Scanner(System.in);
        System.out.println("specify arithmatical operation: ");
        
        // Character input 
        char myChar = charScanner.next().charAt(0); 
        
        if (myChar == '+') {
            System.out.println("SUM of the inputed numbers is "+(myFloat1+myFloat2));
        }
        
        else if (myChar == '-') {
            System.out.println("Difference of the inputed numbers is "+(myFloat1-myFloat2));
        }
        
        else if (myChar == '*') {
            System.out.println("Product of the inputed numbers is "+(myFloat1*myFloat2));
        }
        
        else if (myChar == '/') {
            System.out.println("Quotient of the inputed numbers is "+(myFloat1/myFloat2));
        }
        
    }
    
}
