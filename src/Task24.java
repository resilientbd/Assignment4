
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
public class Task24 {
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        
        System.out.println("enter your 1st number: ");
        int num1= scan.nextInt();
        
        System.out.println("enter your 2nd number ");
        int num2= scan.nextInt();
        
        Scanner sscan =new Scanner (System.in);
        System.out.println("Enter your opertion: ");
        String op =sscan.next();
        
        if (op.equals("+")){
            System.out.print("Your ans is : "+(num1+num2));
            
        }
        
        else if (op.equals("-")){
            System.out.print("Your ans is :"+(num1-num2) );
        }
            else if (op.equals("*")){
                    System.out.print("your number is:"+(num1*num2));
                    }
            else{
                System.out.println("sorry opertaion filed");
            }
        }
    }
    

