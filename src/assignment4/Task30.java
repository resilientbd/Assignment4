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
public class Task30 {
     public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter newspaper amount : ");
        int num = s.nextInt();
        
        System.out.println("Monthly fees is : "+(num*500));
        
    }
    
}