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
public class Task22 {
     public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
           
           
           
       System.out.println("Enter your marks...."); 
       int mark = scan.nextInt();
        
        if((mark >= 90) && (mark < 100)){
            
          System.out.println("A 4.0 Excellent");
  
        }else if((mark >= 85) && (mark <= 90)){
            System.out.println("A- 3.7 Excellent");
        }else if((mark >= 80) && (mark <= 85)){
            System.out.println("B+ 3.3 Excellent");
        }else if((mark >= 75) && (mark <= 80)){
            System.out.println("B 3.0 Good");
        }else if((mark >= 75) && (mark <= 80)){
            System.out.println("B- 2.7 Good");
        }else if((mark >= 65) && (mark <= 70)){
            System.out.println("C+ 2.3 Good");
        }else if((mark >= 60) && (mark <= 65)){
            System.out.println("C 2.0 Fair");
        }
        else if((mark >= 57) && (mark <= 60)){
            System.out.println("C- 1.7 Fair");
        }else if((mark >= 55) && (mark <= 57)){
            System.out.println("D+ 1.3 Fair");
        }else if((mark >= 52) && (mark <= 55)){
            System.out.println("D 1.0 Poor");
        }else if((mark >= 50) && (mark <= 52)){
            System.out.println("D- 0.7 Poor");
        }else{
            System.out.println("F 0.0 Failure");
        }
       
    }//test end 
}
}
