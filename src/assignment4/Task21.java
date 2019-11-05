package assignment4;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = s.nextInt();

        if (marks > 89 && marks < 101) {
            System.out.println("Your grade is A");
        }
        else if (marks > 79 && marks < 90) {
            System.out.println("Your grade is B");
        }
        else if (marks > 69 && marks < 80) {
            System.out.println("Your grade is C");
        }
        else if (marks > 59 && marks < 70) {
            System.out.println("Your grade is D");
        }
        else if (marks > 49 && marks < 60) {
            System.out.println("Your grade is E");
        }
        else {
            System.out.println("Your grade is F");
        }

    }

}
