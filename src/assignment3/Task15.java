package assignment3;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = s.nextInt();

        if (num % 2 == 0) {
            System.out.println("\nYour Number is " + num);
        } else if (num % 5 == 0) {
            System.out.println("\nYour Number is " + num);
        } else {
            System.out.println("\nYour Number is not multiple of either 2 or 5");
        }

    }

}
