/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Task36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float Grade1, Grade2, Grade3, Grade4, GPA;
        int Credit1 = 3, Credit2 = 0, Credit3 = 3, Credit4 = 3;

        System.out.println("Enter CSE110 Greade : ");
        Grade1 = scanner.nextFloat();
        System.out.println("Enter ENG091 Greade : ");
        Grade2 = scanner.nextFloat();
        System.out.println("Enter MAT110 Greade : ");
        Grade3 = scanner.nextFloat();
        System.out.println("Enter PHY111 Greade : ");
        Grade4 = scanner.nextFloat();

        GPA = ((Grade1 * Credit1) + (Grade2 * Credit2) + (Grade3 * Credit3) + (Grade4 * Credit4))/(Credit1+Credit2+Credit3+Credit4);

        System.out.println("Total GPA result : " + GPA);

    }
}
