package assignment4;

import java.util.Scanner;

public class Task22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks x= : ");
        int x = input.nextInt();
        if (x >= 90 && x <= 100) {
            System.out.println("A  (4.0)  Excellent");
        } else if (x >= 85 && x < 90) {
            System.out.println("A-  (3.7)");
        } else if (x >= 80 && x < 85) {
            System.out.println("B+  (3.30)  Good");
        } else if (x >= 75 && x < 80) {
            System.out.println("B   (3.0)");
        } else if (x >= 70 && x < 75) {
            System.out.println("B-  (2.7)");
        }
        else if(x>=65 && x<70)
            System.out.println("C+  (2.30)");
        else if(x>=60 && x<65)
            System.out.println(" C  (2.0)");
        else if(x>=57 && x<60)
            System.out.println("C-  (1.7)");
        else if(x>=55 && x<57)
            System.out.println("D+ (1.3)");
        else if(x>=52 && x<57)
            System.out.println("D (1.0)");
        else if(x>=50 && x<52)
            System.out.println("D- (0.7)");
        else
            System.out.println("F  (0.0)  Failure");

    }

}
