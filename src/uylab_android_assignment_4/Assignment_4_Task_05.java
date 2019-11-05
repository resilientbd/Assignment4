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
public class Assignment_4_Task_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads the radius of a circle and prints its circumference and area.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        double radius=sc.nextInt();
        double pi=3.14159;
        double circumference=2*pi*radius;
        double area=pi*(radius*radius);
        System.out.println("The circumference of the racius is "+circumference);
        System.out.println("The area of the radius is "+area);
    }
    
}
