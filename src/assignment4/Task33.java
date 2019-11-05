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
public class Task33 {
    public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
           
            System.out.println("\nEnter your car name  ..."); 
            String carName = scan.next(); 
            System.out.println("\nEnter one number ..."); 
            int Number = scan.nextInt(); 

           for(int j = 0; j < 4; j++){
               
               System.out.println(""+carName+ " " +Number);

           }
        }
         
    }//test end  
}
