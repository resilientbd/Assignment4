
import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Task25 {
    public static void main(String[]args){
        Scanner scan =new  Scanner(System.in);
        
        System.out.print("enter salary amount:  ");
        int amount = scan.nextInt();
        
        System.out.print("enter your age : ");
        int age= scan.nextInt();
        
        Scanner sscan = new Scanner(System.in);
        System.out.println("your post");
        String post = sscan.next();
        
        if (age<18){
            System.out.print("\n your salary without any tax"+amount+"tk");
        }
        else if(post.equalsIgnoreCase("president")){
            System.out.print("\n your salary without any tax"+amount+"tk");
        }
            else{
                    if (amount<10000){
                    System.out.print("\n your salary without any tax is "+amount+"tk");
                    
                    }
                    else if((amount>=10000)&&(amount>=20000)){
                        System.out.print("\n your salary without 5% any tax is "+(amount*0.95)+"tk");
                    } 
                    else{
                             System.out.print("\n your salary without 10% any tax is "+(amount*0.90)+"tk"); 
                                }
                    }       
        }
    }
    
    

