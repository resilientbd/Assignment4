package assignment4;

import java.util.Scanner;

public class Task23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangular = ");
        int length = input.nextInt();
        System.out.println("Enter the width of rectangular = ");
        int width = input.nextInt();
        System.out.println("The area of rectangular = " + length * width);
    }

}
