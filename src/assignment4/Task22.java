
package assignment4;

import java.util.Scanner;


public class Task22 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the marks = ");
        int marks=input.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println(" Grade 'A' 4.00 Excellent");
        }
        else if(marks>=85 && marks<90)
        {
            System.out.println("Grade 'A-' 3.7");
        }
        else if(marks>=80 && marks<85)
        {
            System.out.println("Grade 'B+' 3.3");
        }
        else if (marks>=75 && marks<80)
        {
            System.out.println("Grade 'B' 3.00 Good");
        }
        else if(marks>=70 && marks<75)
        {
            System.out.println("Grade 'B-' 2.7");
        }
        else if(marks>=65 && marks<70)
        {
            System.out.println("Grade 'C' 2.3");
        }
        else if(marks>=60 && marks<65)
        {
            System.out.println("Grade 'C' 2.00 Fair");
        }
        else if(marks>=57 && marks<60)
        {
            System.out.println("Grade 'C-' 1.7");   
        }
        else if(marks>=55 && marks<57)
        {
            System.out.println("Grade 'D+' 1.3");
        }
        else if(marks>=52 && marks<55)
        {
            System.out.println("Grade 'D' 1.00 Poor");
        }
        else if(marks>=50 && marks<52)
        {
            System.out.println("Grade 'D-' 0.7");
        }
        else
        {
            System.out.println("Grade 'F' 0.0 Failure");
        }
    }
    
    
}
