
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
public class Task21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your marks:");
        int marks = scan.nextInt();

        if (marks > 89 && marks<101){
        System.out.println("your grde is A");
        }

       else if (marks > 79 && marks<90){
        System.out.println("your grde is B");
        }

       else if (marks > 69 && marks<80){
        System.out.println("your grde is C");
        }

       else if (marks > 59 && marks<70){
        System.out.println("your grde is D");
        }

      else  if (marks > 49&& marks<60){
        System.out.println("your grde is E ");
        }
       
        else{
            System.out.println("Your grade is F");
        }   
        
        }

    }
