package assignment4;

import java.util.Scanner;

public class task29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter 'x' value : ");
        int x =scan.nextInt();
        
         System.out.print("enter 'Y' value : ");
        int y =scan.nextInt();
           
         System.out.print("enter 'Z' value : ");
        int z =scan.nextInt();
        
        double s =(x+y+z)/2;
        double area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        
         System.out.print("Area of the trangle is :"+area);
     
        }

}
