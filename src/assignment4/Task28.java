/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Task28 {
     public static void main (String[] args)
   {
        Scanner input = new Scanner(System.in);
     int S,L;
    System.out.println("Enter The L Number:");
    S = input.nextInt();
    if(S<100){
        L=3000-(125*(S*S));
         System.out.println("Result: "+L);
        
    }
    else if(S>=100){
        L=12000/(4+((S*S)/14900));
         System.out.println("Result: "+L);
    }
    else{
        System.out.println("\n");
    }
   }
}
