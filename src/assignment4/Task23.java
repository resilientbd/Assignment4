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
public class Task23 {
    public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the length : ");
	   double length = scanner.nextDouble();
	   System.out.println("Enter the width : ");
	   double width = scanner.nextDouble();
	   double area = length*width;
	   System.out.println(" The Area of Rectangle :"+area);
   }
}
    
