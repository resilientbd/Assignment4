package assignment4;

import java.util.Scanner;

public class task30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter your published newspapers amount : ");
        int num =scan.nextInt();
        
        System.out.println("your monthly fees is : "+(num*500)+"Tk");
    }

}
