
package assignment4;

import java.util.Scanner;


public class Task28 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of S = ");
        int s=input.nextInt();
        int L;
        if(s<100)
        {
            L=3000-(125*s*s);
            System.out.println("The result = "+L);
            
        }
        else
        {
            L=12000/4+((s*s)/14900);
        System.out.println("The result = "+L);
        }
        
    }
    
}
