
package assignment4;

import java.util.Scanner;


public class Task29 {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        float d;
        System.out.println("Enter the value of a,b,c");
        
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=(a+b+c)/2;
        double e=Math.sqrt(d*(d-a)*(d-b)*(d-c));
        
        System.out.println("The result of Trigle = "+e);
    }
    
}
