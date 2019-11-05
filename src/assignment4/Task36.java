
package assignment4;

import java.util.Scanner;


public class Task36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  Grade of your Course CSE110 =   and space Credit = ");
        float a=input.nextFloat();
        int a1=input.nextInt();
        System.out.println("Enter tha Grade of your Course ENG091 =  and space Credit =  ");
        float b=input.nextFloat();
        int b1=input.nextInt();
        System.out.println("Enter tha Grade of your Course MAT110 =  and space Credit =  ");
        float c=input.nextFloat();
        int c1=input.nextInt();
        System.out.println("Enter tha Grade of your Course PHY111 =  and space Credit =  ");
        int d=input.nextInt();
         
        double GPA= ((a*a1)+(b*b1)+(c*c1))/(a1+b1+c1);
        
        System.out.println("GPA  = "+GPA);
        
    }
    
    
}
