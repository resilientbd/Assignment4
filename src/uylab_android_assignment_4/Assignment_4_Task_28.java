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
public class Assignment_4_Task_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
         */
        //ask user to enter the value of 'S'
        System.out.println("Enter the value of 'S' to find the value of L");
        //initialize scanner
        Scanner sc = new Scanner(System.in);
        //declare variable and store value in to it
        float myNum = sc.nextFloat();

        //condition for calculating the value of L
        if (myNum < 100) {
            //output the result
            System.out.println("Value of L is " + (3000 - (125 * (myNum * myNum))));
        } else if (myNum >= 100) {
            //output the result
            System.out.println("Value of L is " + (12000 / (4 + ((myNum * myNum) / 14900))));
        }
    }

}
