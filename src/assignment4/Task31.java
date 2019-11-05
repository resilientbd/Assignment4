
package assignment4;

import java.util.Scanner;

public class Task31 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print(" total course no : ");

        int n = input.nextInt();
        float total=0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Input Course: "+i+" name (space) credits:");
            String crs = input.next();
            float cdt =input.nextFloat();
            total+=cdt;
        }
        System.out.print("Input amount per credits : ");
        float amount=input.nextFloat();
        System.out.println("Total Payable:"+(amount*total));
    }

}