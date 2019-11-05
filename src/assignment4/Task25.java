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
public class Task25 {
    public static void main (String[] args)
   {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary amount : ");
        int amount = sc.nextInt();
        
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter president/No : ");
          String post = s.nextLine();
        
         if(age<18){
            System.out.println("No Tax "+amount+" Tk");
        }
        else if(post.equalsIgnoreCase("president")){
            System.out.println("No Tax "+amount+" Tk");
        }
        else{
        if(amount<10000){
            System.out.println("Any tax "+amount+" Tk");
        }else if((amount>=10000)&&(amount<=20000)){
            System.out.println("5% Tax"+ (amount*5/100));
        }else{
            System.out.println("10% Tax "+ (amount*10/100));
        }
    }
}
}

