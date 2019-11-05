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
public class Assignment_4_Task_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Given number of courses, credits in each course and per credit cost, write the Java code of a program
        that finds out how much a student has to pay for a particular semester.
         */

        //initialize scanner
        Scanner scInt = new Scanner(System.in);
        //ask user to enter number of courses
        System.out.println("Enter the number of courses for your semester: ");
        //store inputed value to integer variable
        int courseNum = scInt.nextInt();
        //ask user to enter credit of each course
        System.out.println("Enter the credit of each course: ");
        //store inputed value to integer variable
        int courseCredit = scInt.nextInt();
        //ask user to enter cost per credit
        System.out.println("Enter cost per credit: ");
        //store inputed value to integer variable
        int costPerCrdt = scInt.nextInt();
        //output the result
        System.out.println("Total cost for this semester is "+(courseNum*courseCredit*costPerCrdt)+" Tk.");
        

    }

}
