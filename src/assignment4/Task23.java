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
public class Task23 {
    public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
           
           
           
       System.out.println("Enter  heigth ..."); 
       int heigth = scan.nextInt();
       System.out.println("Enter width ..."); 
       int width  = scan.nextInt();
       
       int area = (width * heigth);
       
       System.out.println("Area is = " +area);
       
       
        }//test end 
    }
}

