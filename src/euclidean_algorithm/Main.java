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

        //System.out.println);
        int result = gcd(a, b);

        System.out.println("The greatest common divisor of the numbers: " + a + " and " + b + " is " + result);
    }


    public static int gcd(int a, int b) { // a method that calculates the greatest common advisor of two numbers

        a = (a > 0) ? a : -a; // Checking if a number is negative. If so, changing it to the positive
        b = (b > 0) ? b : -b;

        while (b != 0) { // Run this loop until the remainder (in this loop - b) is 0
            int temp = b; // a temporal variable to store the value of b (smaller of two numbers). Later will be used to store the common advisor.
            b = a % b; // b is now a remainder of the division between a and b. Unless it's 0 the loop keep going.
            a = temp; // a has a value of b now. The variable a will be getting smaller and smaller until the remainder (b) is 0. At that point a is our GCD.
        }
        return a;
    }
}
