package assignment4;

import java.util.Scanner;

public class task23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Height : ");
        int h = scan.nextInt();
        
         System.out.print("Enter With  : ");
        int w =scan.nextInt();
        
        int area = h*w;
        System.out.println("area of the rectangle is : "+area);
    }

}
