/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task36 {
    
     public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        
        int grade_1, grade_2, grade_3, grade_4, credit_1, credit_2, credit_3, credit_4, GPA;
        
       
        
        System.out.println("Enter the grade_1 number: ");
      
        grade_1 = scanner.nextInt();
        
        System.out.println("Enter the grade_2 number: ");
      
        grade_2 = scanner.nextInt();
        
        System.out.println("Enter the grade_3 number: ");
      
        grade_3 = scanner.nextInt();
        
        System.out.println("Enter the grade_4 number: ");
      
        grade_4 = scanner.nextInt();
        
        
        
        System.out.println("Enter the credit_1 number: ");
      
        credit_1 = scanner.nextInt();
          
        System.out.println("Enter the credit_2 number: ");
      
        credit_2 = scanner.nextInt();
        
        System.out.println("Enter the credit_3 number: ");
      
        credit_3 = scanner.nextInt();
        
        System.out.println("Enter the credit_4 number: ");
      
        credit_4 = scanner.nextInt();
        
     
        
        GPA =  ((grade_1*credit_1)+(grade_2*credit_2)+(grade_3*credit_3)+(grade_4*credit_4)) / (credit_1+credit_2+credit_3+credit_4);       
        
        System.out.println("the GPA result is: " + GPA);
        
    
    }
    
}
