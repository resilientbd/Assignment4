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
public class Assignment_4_Task_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads two numbers, subtracts the smaller number from the larger
        one, and prints the result.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        
        if (num1>num2) {
            int sub=num1-num2;
            System.out.println("The difference between the inputed numbers is "+sub);
            } 
        if (num2>num1) {
            int sub=num2-num1;
            System.out.println("The difference between the inputed numbers is "+sub);
            }            
    }
    
}
