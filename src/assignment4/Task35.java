/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Task35 {
     public static void main(String[] args) {
    
        Scanner MyScan = new Scanner(System.in);
        System.out.print("Enter Time : ");
        int time = MyScan.nextInt();
        
        if(time>=0&&time<=3){
            System.out.println("Patience is a virtue");
        }
        else if(time>=4&&time<=6){
            System.out.println("Breakfast");
        }
        else if(time>=7&&time<=11){
            System.out.println("Patience is a virtue");
        }
        else if(time>=12&&time<=13){
            System.out.println("Lunch");
        }
        else if(time>=14&&time<=15){
            System.out.println("Patience is a virtue");
        }
        else if(time>=16&&time<=17){
            System.out.println("Snacks");
        }
        else if(time==18){
            System.out.println("Patience is a virtue");
        }
        else if(time>=19&&time<=20){
            System.out.println("Dinner");
        }
        else if(time>=21&&time<=23){
            System.out.println("Patience is a virtue");
        }else{
            System.out.println("Wrong Time");
        }
    }
    
}
