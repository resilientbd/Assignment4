package assignment4;

import java.util.Scanner;

public class task26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("your weekly work hour  : ");
        int hour =scan.nextInt();
        
        if(hour<=40){
         System.out.print("your weekly work hour is  : "+(200*hour+ "TK"));
          }
        else {
                System.out.print("your weekly work hour is  : "+((300*hour)+8000)+ "TK");
        }

}
}