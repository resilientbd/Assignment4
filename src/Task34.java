
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
public class Task34 {
     public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.println("When do you want to talk 'Peak / off peak' hour");
        String peak = s.next();
        
        System.out.println("Which number you want to talk 'F&F / Others Number");
        String op = s.next();
        
        System.out.print("Enter the durations of your call (by minutes) : ");
        int time = s.nextInt();
        
        if(peak.equalsIgnoreCase(peak)){
            if(op.equalsIgnoreCase("f&f")){
                 if(time<6){
                     System.out.println("Your charges for the call is "+(time*4)+" Tk");
                 }else{
                     System.out.println("Your charges for the call is "+((5*4)+(time-5)*2)+" Tk");
                 }
            }else{
                 if(time<6){
                     System.out.println("Your charges for the call is "+(time*7)+" Tk");
                 }else{
                     System.out.println("Your charges for the call is "+((5*7)+(time-5)*6)+" Tk");
                 }
            }
        }else{
            if(op.equalsIgnoreCase("f&f")){
                 if(time<6){
                     System.out.println("Your charges for the call is "+(time*3)+" Tk");
                 }else{
                     System.out.println("Your charges for the call is "+((5*3)+(time-5)*1)+" Tk");
                 }
            }else{
                 if(time<6){
                     System.out.println("Your charges for the call is "+(time*8)+" Tk");
                 }else{
                     System.out.println("Your charges for the call is "+((5*8)+(time-5)*5)+" Tk");
                 }
            }
        }
        
    }
    
    
}
