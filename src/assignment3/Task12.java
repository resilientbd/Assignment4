
package assignment3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of n : ");
        
        int n=input.nextInt();
        int result=(n*(n+1))/2;
        System.out.println("The result is = "+result);
        
        
    }
    
}
