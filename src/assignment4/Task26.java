
package assignment4;

import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your weekly work hour : ");
        int hour = s.nextInt();
        
        if(hour<=40){
            System.out.println("Your Weekly Salary is : "+(200*hour)+" Tk");
        }else{
            System.out.println("Your Weekly Salary is : "+((300*hour)+8000)+" Tk");
        }
        
    }
    
}
