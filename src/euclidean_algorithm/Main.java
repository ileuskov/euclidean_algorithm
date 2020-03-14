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

        int result_recursion = gcd_recursion(a, b);

        System.out.println("*** Recursion version*** \n The greatest common divisor of the numbers: " + a + " and " + b + " is " + result_recursion);
    }


    public static int gcd(int a, int b) { // a method that calculates the greatest common divisor of two numbers

        a = (a > 0) ? a : -a; // Checking if a number is negative. If so, changing it to the positive
        b = (b > 0) ? b : -b;

        while (b != 0) { // Run this loop until the second number (in this loop used as a remainder) is 0. If the second number 0 then the GCD is the first number
            int temp = b; // a temporal variable to store the value of b (smaller of two numbers). Later will be used to store the common divisor.
            b = a % b; // b is now a remainder of the division between a and b. Unless it's 0 the loop keep going.
            a = temp; // a has a value of b now. The variable a will be getting smaller and smaller until the remainder (b) is 0. At that point a is our GCD.
        }
        return a;
    }

    public static int gcd_recursion(int a, int b) { // a method that calculates the greatest common divisor by using the recursion
        a = (a > 0) ? a : -a; // Checking if a number is negative. If so, changing it to the positive
        b = (b > 0) ? b : -b;

        if (b == 0) { // if the second number is 0 then the GCD is the first number
            return a;
        }
        else
            return gcd_recursion(b, a % b); // if the second number is not 0 then we call the method one more time. This time the first number is b and the second the remainder of the division of a and b
    }
}
