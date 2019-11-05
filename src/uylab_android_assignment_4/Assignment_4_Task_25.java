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
public class Assignment_4_Task_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code for a program that calculates the tax as follows:
            a) No tax if you get paid less than 10,000
            b) 5% tax if you get paid between 10K and 20K
            c) 10% tax if you get paid more than 20K
            d) NO TAX IF YOU ARE LESS THAN 18 YEARS OLD.
            e) NO TAX IF YOU ARE THE PRESIDENT OF THE COMPANY
         */

        //initialize Scanner for age input
        Scanner ageScanner = new Scanner(System.in);

        //prompt for user age
        System.out.println("Hi, How old are you..?");
        int age = ageScanner.nextInt();

        //condition for age
        if (age >= 18) {
            //prompt for user position in the company
            System.out.println("Are you the PRESIDENT of the company? Write 'Yes' or 'No'");
            //initialize Scanner for string input
            Scanner positionScanner = new Scanner(System.in);
            //store the value found from scanner to string variable
            String position = positionScanner.nextLine();
            //condition for company postion 
            if (position.equalsIgnoreCase("no")) {
                //promt for salary amount
                System.out.println("How much is your salary");
                //initialize scanner for salary input
                Scanner salaryScanner = new Scanner(System.in);
                //store the value found from scanner to integer variable
                int salary = salaryScanner.nextInt();
                //condition for tax calculation
                if (salary >= 10000 && salary < 20000) {
                    System.out.println("Your Tax amount is " + (salary * 0.05));
                } else if (salary >= 20000) {
                    System.out.println("Your Tax amount is " + (salary * 0.10));
                } else {
                    System.out.println("Tax is NOT Applicable for you");
                }
            } else {
                System.out.println("Tax is NOT Applicable for you");
            }
        } else {
            System.out.println("Tax is NOT Applicable for you");
        }
    }
}
