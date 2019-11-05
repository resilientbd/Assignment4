package assignment4;

import java.util.Scanner;

public class Task_31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Write your total course no : ");

        int n = scan.nextInt();
        float total=0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Input Course: "+i+" name (space) credits:");
            String crs = scan.next();
            float cdt = scan.nextFloat();
            total+=cdt;
        }
        System.out.print("Input amount per credits : ");
        float amount=scan.nextFloat();
        System.out.println("Total Payable:"+(amount*total));
    }

}
