/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author MDZAKARIA
 */
public class Task36 {
    public static void main(String[] args)
    {
         
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter gpa for CSE110 : ");
        float g1 = s.nextFloat();
        
        System.out.print("Enter gpa for ENG091 : ");
        float g2 = s.nextFloat();
        
        System.out.print("Enter gpa for MATH110 : ");
        float g3 = s.nextFloat();
        
        System.out.print("Enter gpa for PHY111 : ");
        float g4 = s.nextFloat();
        
        System.out.println("GPA is : "+(((g1*3)+(g2*3)+(g3*0)+(g4*3))/9));
    
         
    }
}
