
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Task26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your weekly work hour:  ");
        int hour= scan.nextInt();
        if(hour<=40){
            System.out.println("Your weekly salary is: "+(200*hour)+"tk");}
        else{
            System.out.println("your weekly salary is :"+((300*hour)+800)+"tk");
        }
    }
    
}
