package assignment4;

import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter thr hours of person = ");
        int hour = input.nextInt();
        int salary;
        if (hour <= 40) {
            salary = hour * 200;
            System.out.println("salary = " + salary);

        } else {
            salary = 8000 + (hour * 300);
            System.out.println("salary = " + salary);
        }

    }

}
