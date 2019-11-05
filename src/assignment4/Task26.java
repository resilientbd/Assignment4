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
public class Task26 {
    public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
     
       System.out.println("Enter Work Hours ..."); 
       int hours  = scan.nextInt(); 
       
       
       int overtime = hours - 40;
       
       if(hours <= 40){
           
           System.out.println("Salary is = "+hours * 200);
           
           
         
        }else{
           int withoutOver = hours * 200;
           int extratime = overtime * 300;
           System.out.println("Salary is = "+ (withoutOver +extratime));
       } 
          
          
    }
         
    }//test end 
}
