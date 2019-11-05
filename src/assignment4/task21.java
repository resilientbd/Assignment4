package assignment4;

import java.util.Scanner;

public class task21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter your marks : ");
        int marks =scan.nextInt();
        
        
        if(marks>89 && marks <101){
        System.out.println("your grade is A");  
    }
        else if(marks>79 && marks <90){
        System.out.println("your grade is B");  
    }
        else if(marks>69 && marks <80){
        System.out.println("your grade is C");  
    }
             else if(marks>59 && marks <70){
        System.out.println("your grade is D");  
    }
            else if(marks>49 && marks <60){
        System.out.println("your grade is E");  
    }
        else {
            System.out.println("your grade is F");  
        }

}
}