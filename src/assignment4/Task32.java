package assignment4;

import java.util.Scanner;

public class Task32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of 'Q' : ");
        int q = scan.nextInt();

        int p = 6000+(15*q*q);
        int p2 = 1000/(3+(q*q/1900));

        if (q <=50) {
            System.out.println("Value of 'P' is " + p);
        } else {
            System.out.println("Value of 'P' is " + p2);
        }

    }

}
