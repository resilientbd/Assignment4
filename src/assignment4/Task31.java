/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author MDZAKARIA
 */
public class Task31 {
    public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       float a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
       
       System.out.print("Enter Course total No... : ");

        int n = scan.nextInt();
        float total=0;
        
        for (int j = 1; j <= n; j++) {
            System.out.println("Input Course: "+j+" name (space) credits:");
            String crs = scan.next();
            float cdt = scan.nextFloat();
            total+=cdt;
        }
        System.out.print("Input amount per credits : ");
        float amount=scan.nextFloat();
        System.out.println("Total Payable:"+(amount*total));
          
        }
         
    }
}
