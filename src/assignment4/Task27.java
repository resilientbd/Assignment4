package assignment4;

import java.util.Scanner;

public class Task27 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Second : ");
        int num = input.nextInt();

        int hour = num / 3600;
        int min = (num - (hour * 3600)) / 60;
        int sec = num - ((min * 60) + (hour * 3600));

        System.out.println("hour =\t " + hour);
        System.out.println("min =\t " + min);
        System.out.println("sec = \t " + sec);

    }

}
