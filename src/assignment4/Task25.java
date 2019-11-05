package assignment4;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your salary amount : ");
        int amount = s.nextInt();

        System.out.print("Enter your age : ");
        int age = s.nextInt();

        Scanner ss = new Scanner(System.in);
        System.out.print("Your Post : ");
        String post = ss.nextLine();

        if (age < 18) {
            System.out.println("\nYour Salary without any tax is " + amount + " Tk");
        } else if (post.equalsIgnoreCase("president")) {
            System.out.println("\nYour Salary without any tax is " + amount + " Tk");
        } else {
            if (amount < 10000) {
                System.out.println("\nYour Salary without any tax is " + amount + " Tk");
            } else if ((amount >= 10000) && (amount <= 20000)) {
                System.out.println("\nYour Salary with 5% tax is " + (amount * 0.95) + " Tk");
            } else {
                System.out.println("\nYour Salary with 10% tax is " + (amount * 0.90) + " Tk");
            }
        }
    }
}
