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
public class Task21 {
     public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();
       
       for(int i = 0; i < a; i++){
           
             
       System.out.println("Enter your marks...."); 
       int mark = scan.nextInt();
       
       int avg = mark/10;
       
       switch (avg){
           case 9:
               System.out.println("A");
               break;
           case 8: 
               System.out.println("B");
               break; 
            case 7: 
               System.out.println("C");
               break; 
            case 6: 
               System.out.println("D");
               break; 
            case 5: 
               System.out.println("E");
               break;
            default:
                 System.out.println("F");
        }
           
       }
       
    }
}
