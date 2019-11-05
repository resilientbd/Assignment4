/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author Shuvo
 */
public class Task11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1= s.nextInt();
        
        System.out.print("Enter 2nd Number : ");
        int num2= s.nextInt();
        
        System.out.print("Enter 3rd Number : ");
        int num3= s.nextInt();
        
        System.out.print("Enter 4th Number : ");
        int num4= s.nextInt();
        
        System.out.print("Enter 5th Number : ");
        int num5= s.nextInt();
        
        int sum = num1+num2+num3+num4+num5;
        System.out.println("\nAverage number is : "+(sum/5));
    }
    
}
