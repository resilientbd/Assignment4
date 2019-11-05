
package assignment3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x=input.nextInt();
        if(x%2 ==0 && x>10)
        {
            System.out.println("An even number greater than 10 ");
        }
        else if (x%2 ==0 && x<10)
                    {
        System.out.println("An even number not greater than 10 ");
                    }
             if(x%2!=0 && x>10)
        {
            System.out.println("An odd number greater than 10");
        }
        else if (x%2!=0 && x<10)
                    {
        System.out.println("An odd number not greater than 10 ");
    
                    }
                    
    
}
    }       
