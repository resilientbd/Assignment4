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
public class Task27 {
     public static void main (String[] args)
   {
       
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Seconds: ");
       int input = sc.nextInt();

       int hours = input / 3600;
       int minutes = (input % 3600) / 60;
       int seconds = (input % 3600) % 60;

       System.out.println("Hours: " + hours);
       System.out.println("Minutes: " + minutes);
       System.out.println("Seconds: " + seconds);
 
   }
}
   

