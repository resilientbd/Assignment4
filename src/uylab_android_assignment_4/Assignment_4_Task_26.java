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
public class Assignment_4_Task_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code for a program that computes and displays a person’s weekly salary as determined
        by the following conditions:
        If the hours worked are less than or equal to 40, the person receives Tk200.00 per hour, else the
        person receives Tk8000.00 plus Tk300.00 for each hour worked over 40 hours.
        The program should request the hours worked as input and should display the salary as output.
         */

        //initialize scanner for work hour input
        Scanner sc = new Scanner(System.in);
        //prompt for user work hour
        System.out.println("How many hours did you work weekly..?");
        //store value found from scanner to a integer type variable
        int work_hour = sc.nextInt();
        //condition for calcultion of salary
        if (work_hour <= 40) {
            System.out.println("Your salary is " + work_hour * 200);
        } else if (work_hour > 40) {
            //declare integer variable for overtime and calculation of overtime 
            int over_time = work_hour - 40;
            System.out.println("Your salary is " + (8000 + (300 * over_time)));
        }

    }

}
