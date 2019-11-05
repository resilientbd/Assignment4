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
public class Task21 {
    
     public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    int students_marks;
    
    
    System.out.println("Enter the students marks : ");
    students_marks = scanner.nextInt();
    
      
    if(students_marks>=90){
    System.out.println("Grade A");
    }  
    else if(students_marks>=80 && students_marks<89){
    System.out.println("Grade B");
    }
    else if(students_marks>=70 && students_marks<79){
    System.out.println("Grade C");
    }
    else if(students_marks>=60 && students_marks<69){
    System.out.println("Grade D");
    }
    else if(students_marks>=50 && students_marks<59){
    System.out.println("Grade E");
    }
   
    else{
    System.out.println("Grade F");
    
    }
  
    }
    
}
