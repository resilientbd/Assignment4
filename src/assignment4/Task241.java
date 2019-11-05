
package assignment4;
import java.util.Scanner;
public class Task241 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number :");
       float a=input.nextFloat();
        System.out.println("Enter the operator :");
               
       char operator=input.next().charAt(0);
        System.out.println("Enter the second number: ");
        float b= input.nextFloat();
        if(operator=='+')
            System.out.println(a+b);
        else if(operator=='-')
            System.out.println(a-b);
        else if(operator=='*')
            System.out.println(a*b);
        else if(operator=='/')
            System.out.println(a/b);
        
    }
}
