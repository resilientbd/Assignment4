/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Task24 {
    public static void main (String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     float num1,num2,result;
	   System.out.println("Enter First number : ");
	 num1 = scanner.nextFloat();
	   System.out.println("Enter Second Numbere : ");
	    num2 = scanner.nextFloat();
            
            result=num1+num2;
               System.out.println("Add: "+result);
                result=num1-num2;
               System.out.println("Substract: "+result);
                result=num1*num2;
               System.out.println("Multiply: "+result);
                result=num1/num2;
               System.out.println("divide: "+result);
            
}
}
