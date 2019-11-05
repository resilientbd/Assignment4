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
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Task29 {
     public static void main (String[] args)
   {
        Scanner input = new Scanner(System.in);
     int S,X,Y,Z,Area;
    System.out.println("First Number:");
    X = input.nextInt();
    System.out.println("Second Number:");
    Y = input.nextInt();
    System.out.println("Third Number:");
    Z = input.nextInt();
    S=(X+Y+Z)/2;
     System.out.println("Result: "+S);
     Area=(int)sqrt (S&(S-Z)*(S-Y)*(S-Z));
     System.out.println("Result: "+Area);
   }
}
