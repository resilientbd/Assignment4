package assignment4;

import java.util.Scanner;


public class Task32 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter of Q ");
        int Q=input.nextInt();
        int P;
        if(Q<=50)
        {
            P=6000+(15*Q*Q);
            System.out.println("The Result is = "+P);
        }
        else 
        {
            P=1000/3+((Q*Q)/1900);
            System.out.println("The result is = "+P);
        }
        
        
    }
}