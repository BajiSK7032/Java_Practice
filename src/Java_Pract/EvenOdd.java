package Java_Pract;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number1: ");
        int num1 =reader.nextInt();
        System.out.print("Enter a number2: ");
        int num2 =reader.nextInt();
  
        System.out.println("sum of two numbers "+(num1+num2));
        
        if(num1 % 2 == 0)
            System.out.println(num1+ " is even");
        else
            System.out.println(num1 + " is odd");
    }
}
