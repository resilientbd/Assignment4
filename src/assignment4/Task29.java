/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task29 {
    
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    int s, x , y, z, area;
   
    
    System.out.println("Enter the 1st number : ");
    x = scanner.nextInt();
    
    System.out.println("Enter the 2nd number : ");
    y = scanner.nextInt();
    
    System.out.println("Enter the 3rd number : ");
    z = scanner.nextInt();
    
       s = (x+y+z)/2;
       
       System.out.println("the s number is : " + s);
    
       area = (int) sqrt (s*(s-x)*(s-y)*(s-z));
       
       System.out.println(" the area is : " + area);
    }
}
