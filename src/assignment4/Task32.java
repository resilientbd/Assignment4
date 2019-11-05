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
public class Task32 {
    public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
           
            System.out.println("\nEnter Value of S ..."); 
            float Q  = scan.nextFloat(); 

            if(Q <= 50){
                float P = (float) (6000 - 15 * (Math.pow(Q,2)));
               System.out.printf(" s <100 value is = "+P,"\n");
            }
            else if (Q >= 50){
               float P1 = (float) (3+ (1000/(Math.pow(Q,2)/1900)));
               System.out.printf("s>=100 value is = "+P1,"\n");
            }
          
        }
         
    }//test end  
}
