/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task24 {
    
     public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    float number_1, number_2, result;
    
    
    System.out.println("Enter the 1st number : ");
    number_1 = scanner.nextFloat();
    
    System.out.println("Enter the 2nd number : ");
    number_2 = scanner.nextFloat();
    
    
    result = number_1 + number_2;
        
    System.out.println("the  adding result is: " + result);
    
    
    result = number_1 - number_2;
        
    System.out.println("the subtrct result is: " + result);
    
    
    result = number_1 * number_2;
        
    System.out.println("the multiply result is: " + result);
    
    
    result = number_1 / number_2;
        
    System.out.println("the dividing result is: " + result);
    
     }
    
}
