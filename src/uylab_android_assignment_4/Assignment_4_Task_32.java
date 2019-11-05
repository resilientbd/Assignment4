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
public class Assignment_4_Task_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //prompt user for input
        System.out.println("Enter the value of Q ");
        //initialize scanner
        Scanner sc = new Scanner(System.in);
        //store value into the variable
        int myNum = sc.nextInt();
        //caculation of the value of P based on condition
        if (myNum <= 50) {
            System.out.println("Value of P is " + (6000 + (15 * (myNum * myNum))));
        } else if (myNum > 50) {
            System.out.println("Value of P is " + (1000 / (3 + ((myNum * myNum) / 1900))));
        }
    }

}
