package assignment4;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salary, age, a;
          double tax;

        System.out.println("Are you president of the company? if Yes then press 1 otherwise 0");
        a = input.nextInt();
        if (a == 1) {
            System.out.println("no tax");
        } else {
            System.out.println("Enter the age :");
            age = input.nextInt();

                if (age < 18) {
                     System.out.println("no tax");
                } 
                else{
                    
                    System.out.println("Enter the salary :");
                    salary=input.nextInt();
                    
                 if (salary < 10000) {
                System.out.println("no tax");
                  }
                 
                 else if (salary >= 10000 && salary < 20000)
                 
                 {
                   
                     tax=salary*0.005;
                 
                System.out.println("tax ="+tax);
            }
                 
                 else if (salary >= 20000) 
                 {
                     tax=salary*0.01;
                 
                System.out.println("tax="+tax);
            }
        }

        }}
    }
