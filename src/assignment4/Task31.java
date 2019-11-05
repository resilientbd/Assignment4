package assignment4;

import java.util.Scanner;

public class Task31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write your total course number : ");
        int n = sc.nextInt();
        
        float total=0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Input "+i+" Course name (space) credits:");
            String crs = sc.next();
            float cdt = sc.nextFloat();
            total+=cdt;
        }
        System.out.print("Input amount per credits : ");
        float amount=sc.nextFloat();
        System.out.println("Your Total fees of the semester is "+(amount*total+" Tk"));
    }

}
