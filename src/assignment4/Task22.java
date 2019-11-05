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
public class Task22 {
    public static void main(String[] args) {

        Scanner MyScan = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = MyScan.nextInt();

        if (marks > 89 && marks < 101) {
            System.out.println("Your grade is A\nYou point 4.00 and\nYou did Excellent");

        } else if (marks > 84 && marks < 90) {
            System.out.println("Your grade is A-\nYou point 3.70 and\nYou did Excellent");

        } else if (marks > 79 && marks < 85) {
            System.out.println("Your grade is B+\nYou point 3.30 and\nYou did Excellent");

        } else if (marks > 74 && marks < 80) {
            System.out.println("Your grade is B\nYou point 3.00 and\nYou did Good");
        }
        else if (marks > 69 && marks < 75) {
            System.out.println("Your grade is B-\nYou point 2.70 and\nYou did Good");
        }
        else if (marks > 64 && marks < 70) {
            System.out.println("Your grade is C+\nYou point 2.30 and\nYou did Good");
        }
        else if (marks > 59 && marks < 65) {
            System.out.println("Your grade is C\nYou point 2.00 and\nYou did Fair");
        } 
        else if (marks > 56 && marks < 60) {
            System.out.println("Your grade is C-\nYou point 1.70 and\nYou did Fair");
        }
        else if (marks > 54 && marks < 57) {
            System.out.println("Your grade is D+\nYou point 1.30 and\nYou did Fair");
        } 
        else if (marks > 51 && marks < 55) {
            System.out.println("Your grade is D\nYou point 1.00 and\nYou did Poor");
        }
        else if (marks > 49 && marks < 52) {
            System.out.println("Your grade is D-\nYou point 0.70 and\nYou did Poor");
        } 
        else {
            System.out.println("Your Failed in the Exam");
        }

    }
    
}
