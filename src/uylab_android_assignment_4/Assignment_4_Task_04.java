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
public class Assignment_4_Task_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads two numbers from the user, and prints their sum, product and 
        difference.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int myNum1=sc.nextInt();
        System.out.println("Enter the second number:");
        int myNum2=sc.nextInt();
        int sum=myNum1+myNum2;
        int dif=myNum1-myNum2;
        int mul=myNum1*myNum2;
        System.out.println("Sum of the inputed numbers is "+sum);
        System.out.println("Difference of the inputed numbers is "+dif);
        System.out.println("Product of the inputed numbers is "+mul);
    }
    
}
