
package assignment4;

import java.util.Scanner;


public class Task21 {
   
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Student Marks = ");
        int marks = input.nextInt();
        
        switch (marks/10) {
            case 9:
                System.out.println("A");
                break;

            case 8:
                System.out.println("B");
                break;

            case 7:
                System.out.println("C");
                break;

            case 6:
                System.out.println("D");
                break;

            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("F");    
            

        }

    }
}
