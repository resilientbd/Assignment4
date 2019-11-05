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
public class Task21 {
    public static void main (String[] args)
   {
    Scanner input = new Scanner(System.in);
     int marks;
    System.out.println("Enter your marks ");
    marks = input.nextInt();
   
    if(marks<50)
    {
        System.out.println("Grade F");
    }
     else if(marks>=50 && marks<59)
    {
        System.out.println("Grade E");
    }
    else if(marks>=60 && marks<69)
    {
        System.out.println("Grade D");
    }
    else if(marks>=70 && marks<79)
    {
        System.out.println("Grade C");
    }
    else if(marks>=80 && marks<89)
    {
        System.out.println("Grade B");
    }
    else if(marks>=90)
    {
        System.out.println("Grade A");
    }
   
}
    
}
