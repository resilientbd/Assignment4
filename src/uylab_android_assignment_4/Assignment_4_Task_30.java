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
public class Assignment_4_Task_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        A leading newspaper pays all their freelance writers at a rate of Tk. 500 per published article. Write the
        Java code for a program that will read the number of published articles for one writer, and print the total
        monthly fees for that writer.
        */
        
        //prompt user for input
        System.out.println("How many articles did you write: ");
        //initialize scanner
        Scanner sc=new Scanner(System.in);
        //store value into the variable
        int myNum=sc.nextInt();
        //result output
        System.out.println("Total monthly fees for your articles is Tk "+myNum*500);
    }
    
}
