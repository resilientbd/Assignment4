package assignment4;

import java.util.Scanner;

public class task24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter your 1st number  : ");
        int num1 =scan.nextInt();
        
         System.out.print("enter your 2nd number  : ");
        int num2 =scan.nextInt();
        
         Scanner sscan = new Scanner(System.in);
        System.out.println("Enter your operation");
        String op = sscan.next();
        
        if(op.equals("+")){
          System.out.print("your ans is  : " +(num1+num2));   
        }
        else if(op.equals("-")){
          System.out.print("your ans is  : " +(num1-num2));   
        }
        else if(op.equals("*")){
          System.out.print("your ans is  : " +(num1*num2));   
        }
        else if(op.equals("/")){
          System.out.print("your ans is  : " +(num1/num2));   
        }
        else {
             System.out.println("sorry operation failed");
        }
    }

}
