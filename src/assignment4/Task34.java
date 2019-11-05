/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author MDZAKARIA
 */
public class Task34 {
    public static void main(String[] args)
    {
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
           
            System.out.println("Peak / off peak");
            String pk = scan.next();
        
            System.out.println("F&F / Others Number");
            String op = scan.next();
        
            System.out.print("Durations(minutes) : ");
            int time = scan.nextInt();
            
            if(pk.equalsIgnoreCase(pk)){
                if(op.equalsIgnoreCase("f&f")){
                    if(time<6){
                        System.out.println("Charges "+(time*4)+" Tk");
                    }else{
                        System.out.println("Charge "+((5*4)+(time-5)*2)+" Tk");
                    }
            }else{
                 if(time<6){
                     System.out.println("Charges "+(time*7)+" Tk");
                 }else{
                     System.out.println("Charges "+((5*7)+(time-5)*6)+" Tk");
                 }
            }
        }else{
            if(op.equalsIgnoreCase("f&f")){
                 if(time<6){
                     System.out.println("Charges "+(time*3)+" Tk");
                 }else{
                     System.out.println("Charges "+((5*3)+(time-5)*1)+" Tk");
                 }
            }else{
                 if(time<6){
                     System.out.println("Charges "+(time*8)+" Tk");
                 }else{
                     System.out.println("Charges "+((5*8)+(time-5)*5)+" Tk");
                 }
            }
        }
          
     }
         
  }//test end  
}
