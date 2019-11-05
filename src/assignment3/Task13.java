
package assignment3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.print("Input the Number = ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        if (a%2==0){
            System.out.println("The number is Even  "+a);
        }
        else{
            System.out.println("The number is Odd  "+a);
        }
        if (b%2==0){
            System.out.println("The number is Even  "+b);
        }
        else{
            System.out.println("The number is Odd  "+b);
        }
        if (c%2==0){
            System.out.println("The number is Even  "+c);
        }
        else{
            System.out.println("The number is Odd  "+c);
        }
        if (d%2==0){
            System.out.println("The number is Even  "+d);
        }
        else{
            System.out.println("The number is Odd  "+d);
        }
        if (e%2==0){
            System.out.println("The number is Even  "+e);
        }
        else{
                System.out.println("The number is Odd  "+e);
        }
    }
    
}
