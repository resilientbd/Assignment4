/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Task29 {
     public static void main(String[] args) {
    
        Scanner MyScan = new Scanner(System.in);
        System.out.print("Enter 'x' value : ");
        int x = MyScan.nextInt();
        
        System.out.print("Enter 'y' value : ");
        int y = MyScan.nextInt();
        
        System.out.print("Enter 'z' value : ");
        int z = MyScan.nextInt();
        
        double s =(x+y+z)/2;
        double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
        
        System.out.println("Area of the Triangle is : "+area);
        
    }
    
}
