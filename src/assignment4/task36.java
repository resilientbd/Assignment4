package assignment4;

import java.util.Scanner;

public class task36 {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Grade of your CSE110 : ");
        float num1 = s.nextFloat();
        
        System.out.print("Enter the Grade of your ENG091 : ");
        float num2 = s.nextFloat();
        
        System.out.print("Enter the Grade of your MATH110 : ");
        float num3 = s.nextFloat();
        
        System.out.print("Enter the Grade of your PHY111 : ");
        float num4 = s.nextFloat();
        
        System.out.println("Your GPA : "+(((num1*3)+(num2*3)+(num3*0)+(num4*3))/9));
    }
    
}