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
public class Task24_1 {
    public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
           
           
           
       System.out.println("Enter two floaing-point number ..."); 
       double Fnum1 = scan.nextDouble(); 
       double Fnum2 = scan.nextDouble();
       System.out.println("Ente an Opearator.."); 
       char c = scan.next().charAt(0); 
       
       if(c == '+'){
       
           System.out.printf("adding Result is = %.2f\n", +(Fnum1+ Fnum2));
       }
       if(c == '-'){
       
           System.out.printf("subtracting Result is = %.2f\n", +(Fnum1- Fnum2));
       }
       if(c == '*'){
       
           System.out.printf("multiplying Result is = %.2f\n", +(Fnum1*Fnum2));
       }if(c == '/'){
       
           System.out.printf("dividing  Result is = %.2f\n", +(Fnum1 / Fnum2));
       }
       
       
        }//test end 
    }
}
