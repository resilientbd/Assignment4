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
public class Assignment_4_Task_34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("What is the duration of your call time? (Enter in minutes)");

        Scanner sc = new Scanner(System.in);
        int callTime = sc.nextInt();

        System.out.println("When did you called? \n(Write '1' if it is Peak hour or, Write '2' if it is Peak hour)");
        int hour = sc.nextInt();

        System.out.println("Was the number FnF or Other? \nWrite '1' if the number is FnF or Write '2' if the number is Other than FnF");
        int fnf = sc.nextInt();

        if (hour == 1) {
            if (fnf == 1) {
                if (callTime <= 5) {
                    System.out.println("Your call charge is " + (callTime * 4) + " Tk.");
                } else {
                    System.out.println("Your call charge is " + (callTime * 2) + " Tk.");
                }
            } else if (fnf == 2) {
                if (callTime <= 5) {
                    System.out.println("Your call charge is " + (callTime * 7) + " Tk.");
                } else {
                    System.out.println("Your call charge is " + (callTime * 6) + " Tk.");
                }
            }
        } else if (hour == 2) {
            if (fnf == 1) {
                if (callTime <= 5) {
                    System.out.println("Your call charge is " + (callTime * 3) + " Tk.");
                } else {
                    System.out.println("Your call charge is " + (callTime * 1) + " Tk.");
                }
            } else if (fnf == 2) {
                if (callTime <= 5) {
                    System.out.println("Your call charge is " + (callTime * 8) + " Tk.");
                } else {
                    System.out.println("Your call charge is " + (callTime * 5) + " Tk.");
                }
            }
        }

    }
}
