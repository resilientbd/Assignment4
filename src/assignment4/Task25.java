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
public class Task25 {
     public static void main(String[] args)
    {
       //Zakaria
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter test Case....");
       int a = scan.nextInt();//for test case 
       
       for(int i = 0; i < a; i++){
     
       System.out.println("Enter Tk ..."); 
       int tk  = scan.nextInt(); 
       System.out.println("Enter your age..."); 
       int age = scan.nextInt(); 
       System.out.println("Enter present, (if prestnt inter 1 otherwiser 0) ..."); 
       int present = scan.nextInt(); 
       
       if((tk > 10000) && (age > 18) && (present == 1)){
           
            if((tk > 10000) && (tk < 20000) ){
                
              System.out.println("TEX is = "+ (tk*5/100));
         }
         if(tk > 20000){
             
           System.out.println("TEX is = "+ (tk*10/100));
       }

         
        }else{
           System.out.println("Not Positible");
       } 
          
          
    }
         
    }//test end 
    
}
