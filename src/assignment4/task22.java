package assignment4;

import java.util.Scanner;

public class task22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter your marks : ");
        int marks =scan.nextInt();
        
        
        if(marks>89 && marks <101){
        System.out.println("your grade is A \n your point 4.00 and /n you did Excellent");  
    }
        else if(marks>84 && marks <90){
        System.out.println("your grade is A- \n your point 3.70 and \n you did Excellent");  
    }
           else if(marks>79 && marks <85){
        System.out.println("your grade is B+ \n your point 3.30 and \n you did Excellent");  
    }
              else if(marks>74 && marks <80){
        System.out.println("your grade is B \n your point 3.00 and \n you did good");  
    }
                 else if(marks>69 && marks <75){
        System.out.println("your grade is B- \n your point 2.70 and \n you did good");  
    }            else if(marks>64 && marks <70){
        System.out.println("your grade is C+ \n your point 2.30 and \n you did good");  
    }
                else if(marks>59 && marks <65){
        System.out.println("your grade is C \n your point 2.00 and \n you did fair");  
    }
                else if(marks>56 && marks <60){
        System.out.println("your grade is C- \n your point 1.70 and \n you did fair");  
    }
                  else if(marks>54 && marks <57){
        System.out.println("your grade is D+ \n your point 1.30 and \n you did fair");  
    }
                              else if(marks>51 && marks <55){
        System.out.println("your grade is D \n your point 1.00 and \n you did poor");  
    }
                                          else if(marks>49 && marks <52){
        System.out.println("your grade is D- \n your point 0.70 and \n you did poor");  
    }
        else {
            System.out.println("your failed in the exm");  
        }

}
}