package assignment4;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'x' value : ");
        int x = scan.nextInt();

        System.out.print("Enter 'y' value : ");
        int y = scan.nextInt();

        System.out.print("Enter 'z' value : ");
        int z = scan.nextInt();

        double s = (x + y + z) / 2;
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));

        System.out.println("Area of the Triangle is : " + area);

    }

}
