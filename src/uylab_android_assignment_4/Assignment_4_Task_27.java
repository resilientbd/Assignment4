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
public class Assignment_4_Task_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code for a program that finds the number of hours, minutes, and seconds in a given
        number of seconds. For example, how many hours, minutes, and seconds are there in 10,000 seconds?
         */

        //initialize scanner
        Scanner sc = new Scanner(System.in);

        //ask user to input seconds
        System.out.println("Enter seconds");
        //store value found from scanner to int variable
        int num = sc.nextInt();

        //declare variables and calculate seconds, minutes, hours
        int hour = num / 3600;
        int minute = (num - (hour*3600))/60;
        int second = num - (hour * 3600) - (minute * 60);

        //output the result
        System.out.println(+hour + " hours " + minute + " minutes " + second + " seconds");

    }

}
