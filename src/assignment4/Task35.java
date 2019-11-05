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
public class Task35 {
     public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       System.out.println("Enter time...");
       int time = scan.nextInt();
  
       switch (time){
           case 1:
           case 2:
           case 3:
               System.out.println("Patience is a virtue");
               break;
           
           case 4:
           case 5:
           case 6:
               System.out.println("Breakfist");
               break;
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
               System.out.println("Patience is a virtue");
               break;   
           case 12:
           case 13:
               System.out.println("Lunch");
               break;
           case 14:
           case 15:
           
               System.out.println("Patience is a virtue");
               break;     
           case 16:
           case 17:
               System.out.println("Snacks");
               break; 
           case 18:
                System.out.println("Patience is a virtue");
               break; 
           case 19:
           case 20:
               System.out.println("Dinner");
               break; 
           case 21:
           case 22:
           case 23:
           case 24:
               System.out.println("Patience is a virtue");
               break;      
            default:
                 System.out.println("Wrong time");
        }
       
       }
              
   
}
