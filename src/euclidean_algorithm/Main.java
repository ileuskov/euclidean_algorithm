package euclidean_algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello there! This is my small pet project to find the greatest common divisor of 2 numbers using the Euclidean algorithm. Welcome and have fun! \n" );
        Scanner s = new Scanner(System.in); // Creating a scanner to read 2 numbers for our program

        System.out.println("Enter the first number, please: ");
        int a = Integer.parseInt(s.nextLine()); // Reading a first number

        System.out.println("Now Enter the second number, please: ");
        int b = Integer.parseInt(s.nextLine()); // Reading a second number

        s.close(); // Closing the scanner

        GCD number = new GCD(a, b);
        int result = number.gcd(); // Initializing a variable that stores the result of the simple GCD method

        System.out.println("The greatest common divisor of the numbers: " + a + " and " + b + " is " + result);

        int result_recursion = number.gcd_recursion(a, b); // Initializing a variable that stores the result of the recursion version of the GCD method

        System.out.println("*** Recursion version*** \n The greatest common divisor of the numbers: " + a + " and " + b + " is " + result_recursion);
    }



}
