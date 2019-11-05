
package assignment4;

import java.util.Scanner;


public class Task21 {
    
    public static void main(String[] args)
    {
     Scanner input= new Scanner(System.in); 
        System.out.print("Enter the marks :");
     
     int  x=input.nextInt();
     
     if(x>=90)
            System.out.println("A");
     else if(x>=80 && x<=89)
            System.out.println("B");
     else if(x>=70 && x<=79)
            System.out.println("C");
     else if(x>=60 && x<=69)
            System.out.println("D");
     else if(x>=50 && x<=59)
            System.out.println("E");
     else 
            System.out.println("F");
     
     
    }
    
}
