/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author Shuvo
 */
public class Task12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner s = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int a = s.nextInt();
       
       int result = a*(a+1)/2;
        System.out.println("Sum of these number is "+result);
        
    }
    
}
