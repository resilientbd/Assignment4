package assignment4;

import java.util.Scanner;

public class Task21
{
    public static void main(String args[])
    {
    	
        int marks;
        
      Scanner input = new Scanner(System.in);
       System.out.print("Enter the Marks of Student : ");
      int avg = input.nextInt();
       
        if(avg>=90)
        {
            System.out.println("A");
        }
        else if(avg>=80 && avg<89)
        {
           System.out.println("B");
        } 
        else if(avg>=70 && avg<79)
        {
            System.out.println("C");
        }
        else if(avg>=60 && avg<69)
        {
            System.out.println("D");
        }
        else if(avg>=50 && avg<59)
        {
            System.out.println("E");
        }
        
         else {
            System.out.println("F");
        }
        
    }
}