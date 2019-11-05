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
public class Task23 {
    
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        
        int height, width, rectangle_area;
        
        System.out.println("Enter the number: ");
      
        height = scanner.nextInt();
        
        
        System.out.println("Enter the number: ");
      
        width = scanner.nextInt();
        
        
        rectangle_area = height * width;
        
        System.out.println("the result is: " + rectangle_area);
        
    
    }
    
}
