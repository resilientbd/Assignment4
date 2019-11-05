
package assignment3;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n=input.nextInt();
        for(int num=1;num<=n;num++){
        if(num%2==0 && num%5==0)
                System.out.println("The number is = "+num);
    }
    
}
}