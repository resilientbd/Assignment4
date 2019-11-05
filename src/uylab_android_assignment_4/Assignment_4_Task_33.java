/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uylab_android_assignment_4;

import java.util.Scanner;

/**
 *
 * @author RIYAD Patwary
 */
public class Assignment_4_Task_33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        33. Write the Java code for the following:
        1) Ask the user to enter the name of his favorite car.
        2) Ask the user to enter a Number
        3) Display the name of the user’s favorite car 4 times.
        Example: If the user enters “Toyota” and 20, your program should print the name Toyota 4 times.
         */
        //initialize scanner for string input
        Scanner stScanner = new Scanner(System.in);
        //initialize scanner for integer input
        Scanner intScanner = new Scanner(System.in);
        //Ask the user to enter the name of his favorite car.
        System.out.println("What is the name of your favourite car: ");
        //store the value into string
        String carName = stScanner.nextLine();
        //Ask the user to enter a Number
        System.out.println("Enter a number");
        //store the value into integer variable
        int num = intScanner.nextInt();
        //print user's favourite car name using loop
        for (int i = 0; i < 4; i++) {
            System.out.println("Your favourite car is " + carName);
        }

    }

}
