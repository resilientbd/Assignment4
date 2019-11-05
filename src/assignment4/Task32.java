
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
public class Task32 {
    
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    int P, Q;
    
    
    System.out.println("Enter the the number : ");
    Q = scanner.nextInt();
    
    
    if(Q<=50){
    
     P = 6000 + (15*(Q*Q));
     System.out.println("the result number is : " + P);
    
    }
    
    else if(Q==50){
    
        P = 1000/ 3 + ((Q*Q) / 1900);
        System.out.println("the result number is : " + P);
    
    }
    else{
    
     System.out.println(" ");
    }
    
   
   
    
}
}