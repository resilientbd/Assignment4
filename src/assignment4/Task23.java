
package assignment4;

import java.util.Scanner;

public class Task23 {

    public static void main(String[] args) {
    
        Scanner s =new Scanner(System.in);
        System.out.print("Enter Height : ");
        int h = s.nextInt();
        
        System.out.print("Enter Width : ");
        int w = s.nextInt();
        
        int area = h*w;
        System.out.println("Area of the Rectangle is : "+area);
    }
    
}
