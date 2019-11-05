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
public class Assignment_4_Task_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //initialize scanner
        Scanner sc = new Scanner(System.in);
        //ask user to input the value of X
        System.out.println("Enter the value of X axis of triangle ");
        //store the value of X in a double type variable
        double x_Variable = sc.nextDouble();
        //ask user to input the value of Y
        System.out.println("Enter the value of Y axis of triangle ");
        //store the value of X in a double type variable
        double y_Variable = sc.nextDouble();
        //ask user to input the value of Z
        System.out.println("Enter the value of Z axis of triangle ");
        //store the value of X in a double type variable
        double z_Variable = sc.nextDouble();
        //calculation of the value of s
        double s_Variable = (x_Variable + y_Variable + z_Variable) / 2;
        //calcualtion od area
        double area = Math.sqrt(s_Variable * ((s_Variable - x_Variable) * (s_Variable - y_Variable) * (s_Variable - z_Variable)));
        //output the result
        System.out.println("Area of the Triangle is " + area);

    }

}
