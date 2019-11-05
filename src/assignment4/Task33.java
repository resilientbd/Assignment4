package assignment4;

import java.util.Scanner;

public class Task33 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name of your favorite car ");
        String name = s.next();

        System.out.print("Enter a number ");
        String num = s.next();

        for (int i = 1; i < 5; i++) {
            System.out.println(name);
        }
    }

}
