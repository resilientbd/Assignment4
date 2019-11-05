
package assignment4;

import java.util.Scanner;


public class Task30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of Article = ");
        
        int Article= input.nextInt();
        
        int TotalMonthlyFee=Article*500;
        System.out.println("Total Monthly Fee = "+TotalMonthlyFee);
    }
}