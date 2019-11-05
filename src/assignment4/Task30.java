
package assignment4;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your published newspapers amount : ");
        int num = s.nextInt();
        
        System.out.println("Your Monthly fees is : "+(num*500)+" Tk");
        
    }
    
}
