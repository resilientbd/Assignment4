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
public class Task23 {
    public static void main(String[] args) {
    
        Scanner MyScan =new Scanner(System.in);
        System.out.print("Enter Height : ");
        int h = MyScan.nextInt();
        
        System.out.print("Enter Width : ");
        int w = MyScan.nextInt();
        
        int area = h*w;
        System.out.println("Area of the Rectangle is : "+area);
    }
    
}
