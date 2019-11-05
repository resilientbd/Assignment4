
package assignment4;

import java.util.Scanner;


public class Task27 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the seconds x= ");
        int x=input.nextInt();
        
        
        int hour=x/3600 ;
        int mnt=(x-(hour*3600))/60;
        int sec=x-((mnt*60)+(hour*3600));
        System.out.println("Its "+hour+" Hour "+mnt+" minutes "+sec+" second ");
        
    }
    
}
