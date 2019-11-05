
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
public class Task27 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Seconds : ");
        int num=s.nextInt();
        
        int hour =num/3600;
        int minute =(num-(hour*3600))/60;
        int  second =num-((minute+(hour*60))*60);
        
        System.out.println("Its "+hour+" Hours "+minute+" Minute "+second+" Second.");
    }
}

