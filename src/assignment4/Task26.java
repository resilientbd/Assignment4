/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Task26 {
     public static void main(String[] args) {
    
        Scanner MyScan = new Scanner(System.in);
        System.out.print("Enter Your weekly work hour : ");
        int hour = MyScan.nextInt();
        
        if(hour<=40){
            System.out.println("Your Weekly Salary is : "+(200*hour)+" Tk");
        }else{
            System.out.println("Your Weekly Salary is : "+((300*hour)+8000)+" Tk");
        }
        
    }
    
}
