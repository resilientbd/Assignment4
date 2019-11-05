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
public class Task30 {
    public static void main(String[] args) {
    
        Scanner MyScan = new Scanner(System.in);
        System.out.print("Enter Your published newspapers amount : ");
        int num = MyScan.nextInt();
        
        System.out.println("Your Monthly fees is : "+(num*500)+" Tk");
        
    }
    
    
}
