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
public class Task27 {
    public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
     
       System.out.println("Enter Second ..."); 
       int second  = scan.nextInt(); 
     
       int h = second/3600;
       int m = (second%3600)/60; 
       int s = (second%3600)%60;
       
       System.out.println("hours= " +h);
       System.out.println("minuits= " +m);
       System.out.println("second= " +s);
          
    }
         
    }//test end  
}
