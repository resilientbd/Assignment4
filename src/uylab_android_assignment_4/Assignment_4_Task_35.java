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
public class Assignment_4_Task_35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that takes hour from the user as input and tell it is time for which
        meal.
        User will input the number in 24-hour format say 14 to mean 2pm, 3 to
        mean 3am, 18 to mean 6pm etc.
        Valid inputs are 0 to 23. Inputs less than 0 or more than 23 are
        invalid in 24-hour clock.
        Input will be whole numbers. For example, 3.5 will NOT be given as input.
        Inputs: Message to be printed
        4 to 6: Breakfast
        12 to 13: Lunch
        16 to 17: Snacks
        19 to 20: Dinner
        For all other valid inputs, say &quot;Patience is a virtue&quot;
        For all other invalid inputs, say &quot;Wrong time&quot;
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Input time to know which meal is for this time. \n"
                + "Remember: Input the number in 24-hour format.");
        float time = sc.nextFloat();

        if (time == (int) time) {
            if (time >= 0 && time <= 23) {
                if (time >= 4 && time <= 6) {
                    System.out.println("Braekfast");
                } else if (time >= 12 && time <= 13) {
                    System.out.println("Lunch");
                } else if (time >= 16 && time <= 17) {
                    System.out.println("Snacks");
                } else if (time >= 19 && time <= 20) {
                    System.out.println("Dinner");
                } else {
                    System.out.println("Patience is a virtue");
                }
            } else {
                System.out.println("Wrong time");
            }
        } else {
            System.out.println("Wrong time");
        }
    }

}
