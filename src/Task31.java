
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
public class Task31 {
    public static void main(String[] args) {
        
    
      Scanner sc = new Scanner(System.in);
        System.out.print("Write your total course no : ");

        int n = sc.nextInt();
        float total=0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Input Course: "+i+" name (space) credits:");
            String crs = sc.next();
            float cdt = sc.nextFloat();
            total+=cdt;
        }
        System.out.print("Input amount per credits : ");
        float amount=sc.nextFloat();
        System.out.println("Total Payable:"+(amount*total));
    }

}