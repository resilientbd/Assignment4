
package assignment4;

import java.util.Scanner;

public class Task_23 {

    public static void main(String[] args) {
    
        Scanner myScan =new Scanner(System.in);
        System.out.print("Enter Height : ");
        int h = myScan.nextInt();
        
        System.out.print("Enter Width : ");
        int w = myScan.nextInt();
        
        int area = h*w;
        System.out.println("Area of the Rectangle is : "+area);
    }
    
}
