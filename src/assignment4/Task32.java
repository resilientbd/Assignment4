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
public class Task32 {
     public static void main(String[] args) {

        Scanner MyScan = new Scanner(System.in);
        System.out.print("Enter the value od 'Q' : ");
        int q = MyScan.nextInt();

        int p = 6000+(15*q*q);
        int p2 = 1000/(3+(q*q/1900));

        if (q <=50) {
            System.out.println("Value of 'P' is " + p);
        } else {
            System.out.println("Value of 'P' is " + p2);
        }

    
}
     
}
