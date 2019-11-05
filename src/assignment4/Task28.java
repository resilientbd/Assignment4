
package assignment4;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter s ");
        int s=input.nextInt();
        float L;
        if(s<100)
        {
            L=3000-(125*s*s);
            System.out.println(" L is ="+L );
            
        }
        else if(s>=100)
        {
            L=12000/(4+((s*s)/14900));
            System.out.println(" L is ="+L);
        }
    }
    
}
