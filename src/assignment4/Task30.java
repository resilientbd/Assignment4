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
public class Task30 {
     public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       float a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
           
            System.out.println("Enter Value of Article..."); 
            int art  = scan.nextInt();
            
            System.out.println("Salary is monthly = "+(art * 500));
          
        }
         
    }
}
