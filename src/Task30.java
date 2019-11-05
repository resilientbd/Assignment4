
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
public class Task30 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your published newspapers amount : ");
        int num = s.nextInt();
        
        System.out.println("Your Monthly fees is : "+(num*500)+" Tk");
        
    }
    
}
