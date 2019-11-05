/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Task26 {
      public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter weekly work hour : ");
        int hour = s.nextInt();
        
        if(hour<=40){
            System.out.println("Weekly Salary : "+(200*hour));
        }else{
            System.out.println("Weekly Salary : "+((300*hour)+8000));
        }
        
    }
    
}