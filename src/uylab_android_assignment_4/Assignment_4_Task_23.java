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
public class Assignment_4_Task_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that calculates the area of a rectangle given height and width.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of rectangle: ");
        float height=sc.nextFloat();
        System.out.println("Enter width of rectangle: ");
        float width=sc.nextFloat();
        float area=height*width;
        System.out.println("Area of the rectangle is "+area);
        
    }
    
}
