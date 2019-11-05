package assignment4;

import java.util.Scanner;

public class task25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter your salary amount  : ");
        int amount =scan.nextInt();
        
         System.out.print("enter your age  : ");
        int age =scan.nextInt();
        
         Scanner sscan = new Scanner(System.in);
        System.out.println("your post");
        String post = sscan.next();
        
        if(age<18){
          System.out.print("\n your salary without any tax is "+amount+"TK");   
        }
        else if(post.equalsIgnoreCase("president")){
          System.out.print(" \n your salary without any tax is " +amount+ "TK");   
        }
        else {
            if(amount<10000){
                System.out.print(" \n your salary without any tax is " +amount+ "TK");  
            }
            else if((amount>=10000) && (amount>=20000) ){
          System.out.print(" \n your salary with 5% any tax is "+(amount*0.95)+ "TK");   
        }
        
       
        else {
            System.out.print(" \n your salary with 10% any tax is" +(amount*0.90)+ "TK");
        }
        
    }

}
}