
package assignment4;

import java.util.Scanner;


public class Task25 {
  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;

        double tax;
        float age, salary;
        System.out.print("Are you President Of the Company? Enter 1 for Yes If no Enter 0 = ");
        a = input.nextInt();
        if (a == 1) {
            System.out.println("No Tax");
        } else {
            System.out.println("Enter your age = ");

            age = input.nextFloat();
            if (age < 18 ) {
                System.out.println("No Tax");
            } else {
                System.out.println("Enter Your Salary = ");
                salary = input.nextFloat();
                if (salary >= 10000 && salary < 20000) {
                    tax = salary * 0.05;
                    System.out.println("The Tax is " + tax);
                } else {
                    tax = salary * 0.1;
                    System.out.println("Tax is = " + tax);
                }

            }

        }

    }
    
    
}