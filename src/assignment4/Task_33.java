
package assignment4;

import java.util.Scanner;

public class Task_33 {

    public static void main(String[] args) {
    
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter the name of your favorite car ");
        String name = myScan.next();
        
        System.out.print("Enter a number ");
        String num =myScan.next();
        
        
        for(int i=1;i<5;i++){
            System.out.println(name);
        }
        
    }
    
}
