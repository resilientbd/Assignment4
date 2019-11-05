package assignment4;

import java.util.Scanner;

public class Task_24 {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = myScan.nextInt();

        System.out.print("Enter 2nd Number : ");
        int num2 = myScan.nextInt();

        Scanner smyScan = new Scanner(System.in);
        System.out.print("Enter your operation ");
        String op = smyScan.next();

        if (op.equals("+")) {
            System.out.println("Your answer is " + (num1 + num2));
        } else if (op.equals("-")) {
            System.out.println("Your answer is " + (num1 - num2));
        } else if (op.equals("*")) {
            System.out.println("Your answer is " + (num1 * num2));
        } else if (op.equals("/")) {
            System.out.println("Your answer is " + (num1 / num2));
        } else {
            System.out.println("Sorry operation failed");
        }

    }

}
