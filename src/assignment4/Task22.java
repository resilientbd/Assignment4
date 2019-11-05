
package assignment4;

import java.util.Scanner;

public class Task22 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Ther Marks of Students = ");
        
        int marks=input.nextInt();
        
        if(marks>=90 && marks<=100)
        {
            System.out.println("Excellent  A  (4.0)");
            
        }
        else if(marks>=85 && marks<90)
        {
            System.out.println("A-  (3.7)");
        }
        
        else if(marks>=80 && marks<85)
        {
            System.out.println(" B+  (3.3)");
        }
        else if(marks>=75 && marks<80)
        {
            System.out.println("Good  B  (3.0) ");
            
        }
        
        else if(marks>=70 && marks<75)
        {
            System.out.println(" B-  (2.7) ");
            
        }
        else if(marks>=65 && marks<70)
        {
            System.out.println(" C+  (2.3) ");
            
        }
        else if(marks>=60 && marks<65)
        {
            System.out.println("Fair  C  (2.0) ");
            
        }
        else if(marks>=57 && marks<60)
        {
            System.out.println(" C-  (1.7) ");
            
        }
        
        else if(marks>=55 && marks<57)
        {
            System.out.println(" D+  (1.3) ");
            
        }
        
        else if(marks>=52 && marks<55)
        {
            System.out.println("Poor  D  (1.0) ");
            
        }
        else if(marks>=50 && marks<52)
        {
            System.out.println(" D-  (0.7) ");
            
        }
        
        else
        {
            System.out.println("Failure  F (0.0)");    
        }
        
        
        
        
    }
    
    
    
}
