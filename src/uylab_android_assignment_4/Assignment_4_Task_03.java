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
public class Assignment_4_Task_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads one number from the user, and prints it back to show which
        number was entered by the user.Write the Java code of a program that reads one number from the user, and prints it back to show which
        number was entered by the user.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int myNum1=sc.nextInt();
        System.out.println("the number entered by user is "+myNum1);
    }
    
}
