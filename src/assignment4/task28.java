package assignment4;

import java.util.Scanner;

public class task28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter the value of  : ");
        int num =scan.nextInt();
        
         int l = 3000-(125*num*num);
         int l2 =( 12000/ (4+(num*num)/14900));
         
        if(num<100){
                 
         System.out.print("value of 'L' is"+1);
     
        }
        else {
          System.out.print("value of 'L' is"+12);
        }

}
}