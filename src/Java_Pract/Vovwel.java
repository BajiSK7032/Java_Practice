package Java_Pract;

import java.util.Scanner;

public class Vovwel {

    public static void main(String[] args) {

    	Scanner reader = new Scanner(System.in);

        System.out.println("Enter A Character: ");
        String ch =reader.next();
        
        if (ch== "a" ||ch== "e" || ch== "i" || ch== "o" || ch== "u") {
        	System.out.println(ch+"  is  a Vowel");
        }
        else {
        	System.out.println(ch+"  is  a consonant");
        }
       
        
    }

    
}

