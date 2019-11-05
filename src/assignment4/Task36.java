/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Task36 {
     public static void main(String[] args) {
    
        Scanner MyScan = new Scanner(System.in);
        System.out.print("Enter the Grade of your CSE110 : ");
        float num1 = MyScan.nextFloat();
        
        System.out.print("Enter the Grade of your ENG091 : ");
        float num2 = MyScan.nextFloat();
        
        System.out.print("Enter the Grade of your MATH110 : ");
        float num3 = MyScan.nextFloat();
        
        System.out.print("Enter the Grade of your PHY111 : ");
        float num4 = MyScan.nextFloat();
        
        System.out.println("Your GPA : "+(((num1*3)+(num2*3)+(num3*0)+(num4*3))/9));
    }
    
}
