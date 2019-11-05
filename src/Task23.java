
import java.util.Scanner;
import javax.swing.Spring;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Task23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter you 1st height: ");
        int h =scan.nextInt();
        
        System.out.print("Enter your 2nd width :  ");
        int w =scan.nextInt();
        
        int area = h*w;
        System.out.println("area of the rectangleis: "+area);
        
    }
    
}
