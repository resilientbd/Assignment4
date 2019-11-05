package assignment4;

import java.util.Scanner;

public class Task24{
    public static void main(String args[]){
        
      Scanner s = new Scanner(System.in);
       System.out.print("Enter 1st Number : ");
      int num1 = s.nextInt();
      
      System.out.print("Enter 2nd Number : ");
      int num2 = s.nextInt();
      
      Scanner ss = new Scanner(System.in);
       System.out.print("Enter your operation ");
       String op =ss.next();
       
       if (op.equals("+")){
           System.out.print("Your answer is " + (num1+num2));
           
       } else if (op.equals("-")) {
           System.out.print("Your answer is " + (num1-num2));
           
           
       } else if (op.equals("-")) {
           System.out.print("Your answer is " + (num1*num2));
           
           
       } else if (op.equals("-")) {
           System.out.print("Your answer is " + (num1/num2));
              
       } else {
           System.out.print("Sorry opertion failed");
           
       }
      
      
    }
}