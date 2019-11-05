
package assignment4;

import java.util.Scanner;


public class Task26 {
    public static void main(String[] args) {
Scanner input= new Scanner(System.in);
        System.out.println("Enter the hour");
        int hour,salary;
        
        hour=input.nextInt();
        if(hour<=40)
        {
            salary=hour*200;
            System.out.println(salary);
        }
        else
        {
            salary=(hour-40)*300+8000;
            System.out.println(salary);
        }
    }
    
}
