package assignment4;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float FirstNumber = 0;
        char operat = 0;
        float SecondNumber = 0;
        char ans = 'y';

        do {
            System.out.print("Enter the valu of Frist Number = ");
            FirstNumber = input.nextFloat();

            operat = input.next().charAt(0);
            System.out.println("Enter the Value of Second Number = ");

            SecondNumber = input.next().charAt(0);

            switch (operat) {
                case '+':
                    System.out.println(FirstNumber + SecondNumber);
                    break;
                case '-':
                    System.out.println(FirstNumber - SecondNumber);
                    break;

                case '*':
                    System.out.println(FirstNumber * SecondNumber);
                    break;
                case '/':
                    if (SecondNumber == 0) {
                        System.out.println("Errror End result is 0");

                    } else {
                        System.out.println("FirstNumber / SecondNumber ");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");

            }
            System.out.println("Do another? (y/n)");
            ans = input.next().charAt(0);

        } while (ans != 'n');
    }

}
