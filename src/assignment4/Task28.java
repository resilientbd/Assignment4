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
public class Task28 {
    public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
           
            System.out.println("\nEnter Value of S ..."); 
            float s  = scan.nextFloat(); 

            if(s < 100){
                float l = (float) (3000 - 125 * (Math.pow(s,2)));
               System.out.printf(" s <100 value is = "+l,"\n");
            }
            else if (s >= 100){
               float l1 = (float) (12000/(4+(Math.pow(s,2)/14900)));
               System.out.printf("s>=100 value is = "+l1,"\n");
            }
          
        }
         
    }//test end  
}
