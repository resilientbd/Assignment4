/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task22 {
    
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int students_marks;
    
    
    System.out.println("Enter the students marks : ");
    students_marks = scanner.nextInt();
    
      
    if(students_marks>=90 && students_marks<100){
    System.out.println("Grade A (4.0) Excellent");
    }  
    else if(students_marks>=85 && students_marks<90){
    System.out.println("Grade A- (3.7)");
    }
    else if(students_marks>=80 && students_marks<85){
    System.out.println("Grade B+ (3.3)");
    }
    else if(students_marks>=75 && students_marks<80){
    System.out.println("Grade B (3.0) Good");
    }
     else if(students_marks>=70 && students_marks<75){
    System.out.println("Grade B- (2.7)");
    }
    else if(students_marks>=65 && students_marks<70){
    System.out.println("Grade C+ (2.3)");
    }
    else if(students_marks>=60 && students_marks<65){
    System.out.println("Grade C (2.0) Fair");
    }
    
    else if(students_marks>=57 && students_marks<60){
    System.out.println("Grade C- (1.7)");
    }
     else if(students_marks>=55 && students_marks<57){
    System.out.println("Grade D+ (1.3)");
    }
    else if(students_marks>=52 && students_marks<55){
    System.out.println("Grade D (1.0) Poor");
    }
    else if(students_marks>=50 && students_marks<52){
    System.out.println("Grade D- (0.7)");
    }
   
    else{
    System.out.println("Grade F (0.0) Failure");
    
    }

    }
}
