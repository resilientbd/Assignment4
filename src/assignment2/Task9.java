/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author Shuvo
 */
public class Task9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = s.nextInt();

        System.out.print("Enter 2nd Number : ");
        int num2 = s.nextInt();

        if (num1 > num2) {
            System.out.println("The Subtractions of the numbers is " + (num1 - num2));
        } else {
            System.out.println("The Subtractions of the numbers is " + (num2 - num1));
        }
    }
}
