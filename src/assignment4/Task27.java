
package assignment4;

import java.util.Scanner;

public class Task27 {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Seconds : ");
        int num=s.nextInt();
        
        int hour =num/3600;
        int minute =(num-(hour*3600))/60;
        int  second =num-((minute+(hour*60))*60);
        
        System.out.println("Its "+hour+" Hours "+minute+" Minute "+second+" Second.");
    }
    
}
