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
public class Task28 {
     public static void main(String[] args) {
    
        Scanner MyScan = new Scanner(System.in);
        System.out.print("Enter the value of 'S' : ");
        int num =MyScan.nextInt();
        
        int l =3000-(125*num*num);
        int l2 =12000/(4+(num*num/14900));
        
        if(num<100){
            System.out.println("Value of 'L' is "+l);
        }else{
            System.out.println("Value of 'L' is "+l2);
        }
        
    }
    
}
