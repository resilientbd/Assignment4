
package assignment4;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your salary amount : ");
        float amount = s.nextFloat();
        
        System.out.print("Enter your age : ");
        int age = s.nextInt();
        
        Scanner ss = new Scanner(System.in);
        System.out.print("Your Post (ex: President,Employee etc) : ");
        String post = ss.nextLine();
        
        if(age<18){
            System.out.println("\nYou dont have any tax");
        }
        else if(post.equalsIgnoreCase("president")){
            System.out.println("\nYou dont have any tax");
        }
        else{
        if(amount<10000){
            System.out.println("\nYou dont have any tax");
        }else if((amount>=10000)&&(amount<=20000)){
            System.out.println("\nYour tax is 5% of your salary, and it is "+(amount*0.05)+" Tk");
        }else{
            System.out.println("\nYour tax is 10% of your salary, and it is "+(amount*0.10)+" Tk");
        }
    }
    }
}
