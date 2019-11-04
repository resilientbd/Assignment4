
package assignment3;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks=input.nextInt();
        if(marks>50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("You shall not pass");
        }
    }
    
}
