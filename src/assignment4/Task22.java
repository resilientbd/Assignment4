/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Task22 {
      public static void main (String[] args)
   {
    Scanner input = new Scanner(System.in);
     int marks;
    System.out.println("Enter your marks ");
    marks = input.nextInt();
   
    if(marks<50)
    {
        System.out.println("Grade F(0.0) Failure");
    }
    else if(marks>=50 && marks<52)
    {
        System.out.println("Grade D- (0.7)");
    }
    else if(marks>=52 && marks<55)
    {
        System.out.println("Grade D (1.0) Poor");
    }
    else if(marks>=55 && marks<57)
    {
        System.out.println("Grade D+ (1.3)");
    }
    else if(marks>=57 && marks<60)
    {
        System.out.println("Grade C- (1.7)");
    }
    else if(marks>=60 && marks<65)
    {
        System.out.println("Grade C (2.0) Fair");
    }
    else if(marks>=65 && marks<70)
    {
        System.out.println("Grade C+ (2.3)");
    }
     else if(marks>=70 && marks<75)
    {
        System.out.println("Grade B- (2.7)");
    }
    else if(marks>=75 && marks<80)
    {
        System.out.println("Grade B (3.0) Good");
    }
    else if(marks>=80 && marks<85)
    {
        System.out.println("Grade B+ (3.3)");
    }
    else if(marks>=85 && marks<90)
    {
        System.out.println("Grade A- (3.7)");
    }
    else if(marks>=90 && marks<100)
    {
        System.out.println("Grade A (4.0) EXcellent");
    }
   
}
    
}
