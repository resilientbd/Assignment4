
package assignment4;

import java.util.Scanner;

public class Task_26 {

    public static void main(String[] args) {
    
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter Your weekly work hour : ");
        int hour = myScan.nextInt();
        
        if(hour<=40){
            System.out.println("Your Weekly Salary is : "+(200*hour)+" Tk");
        }else{
            System.out.println("Your Weekly Salary is : "+((300*hour)+8000)+" Tk");
        }
        
    }
    
}
