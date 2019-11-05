
package assignment4;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float height,width;
        System.out.println("Enter the height = ");
        height=input.nextFloat();
        System.out.println("Enter the width = ");
        width=input.nextFloat();
        
        double area=(height*width);
        System.out.println("The area is = " +area);
        
    }
    
}
