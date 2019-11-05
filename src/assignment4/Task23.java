package assignment4;

import java.util.Scanner;

public class Task23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height and width");
        float height, width;
        width = input.nextFloat();
        height = input.nextFloat();

        double area = (height * width);
        System.out.println("The area is " + area);

    }
}
