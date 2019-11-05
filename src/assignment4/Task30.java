
package assignment4;

import java.util.Scanner;


public class Task30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  x, y, z");
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        double s=(x+y+z)/2;
        
        double area= Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("the result is "+area);
        
    }
}
