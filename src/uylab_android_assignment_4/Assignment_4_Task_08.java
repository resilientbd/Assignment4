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
public class Assignment_4_Task_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads two numbers from the user. Your program should then print
        “first is greater” if the first number is greater, “second is greater” if the second number is greater, and “the
        numbers are equal” otherwise.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        
        if (num1>num2) {
            System.out.println("first number is greater");
            } 
        else if (num2>num1)  { 
            System.out.println("second number is greater");
            }
        else if (num2==num1)  { 
            System.out.println("the numbers are equal");
            }        
        
    }
    
}
