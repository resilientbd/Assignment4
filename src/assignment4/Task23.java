package assignment4;

import java.util.Scanner;

public class Task23{
    public static void main(String args[]){
        
      Scanner input = new Scanner(System.in);
       System.out.print("Enter Height : ");
      int h = input.nextInt();
      
      System.out.print("Enter Width : ");
      int w = input.nextInt();
      
      int area = h*w;
      System.out.print("Area if the Rectangle is : "+area);     
    }
}