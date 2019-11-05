
package assignment3;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks =s.nextInt();
        
        if(marks>50){
            System.out.println("Pass");
        }else{
            System.out.println("You shall not pass");
        }
    }
    
}
