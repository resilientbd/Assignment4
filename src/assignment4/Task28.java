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
public class Task28 {
 
    
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    int S, L;
    
    
    System.out.println("Enter the the number : ");
    S = scanner.nextInt();
    
    
    if(S<100){
    
     L = 3000 - (125*(S*S));
    System.out.println("the result number is : " + L);
    
    }
    
    else if(S>=100){
    
        L = 12000/ 4 + ((S*S) / 14900);
        System.out.println("the result number is : " + L);
    
    }
    else{
    
     System.out.println(" ");
    }
    
   
   
    
}
}
