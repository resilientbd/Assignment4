
package assignment4;

import java.util.Scanner;

public class Task_30 {

    public static void main(String[] args) {
    
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter Your published newspapers amount : ");
        int num = myScan.nextInt();
        
        System.out.println("Your Monthly fees is : "+(num*500)+" Tk");
        
    }
    
}
