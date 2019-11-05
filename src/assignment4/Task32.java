
package assignment4;

import java.util.Scanner;


public class Task32 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of Q = ");
        int Q=input.nextInt();
        int P;
        if(Q<=50)
        {
            P=6000+(15*Q*Q);
            System.out.println("The Result of = "+P);
        }
        else 
        {
            P=1000/3+((Q*Q)/1900);
            System.out.println("The result of = "+P);
        }
        
        
    }
}
