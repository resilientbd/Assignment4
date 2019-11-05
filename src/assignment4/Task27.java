package assignment4;

import java.util.Scanner;

public class Task27 {
    public static void main(String args[]){
        
      Scanner scan = new Scanner(System.in);
       System.out.print("your weekly hour : ");
      int num = scan.nextInt();
      
      int hour = num/3600;
      int minute = (num-(hour*3600))/60;
      int second = num- ((minute+(hour*60))*60);
      
       System.out.print("Its "+hour+" hourse "+minute+" minute "+second+" second");
      
    }
}