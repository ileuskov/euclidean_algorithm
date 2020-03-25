package euclidean_algorithm;

public class GCD {
    int a;
    int b;
    public GCD(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int gcd() { // a method that calculates the greatest common divisor of two numbers
        // Checking if a number is negative. If so, changing it to the positive
        a = (a > 0) ? a : -a;
        b = (b > 0) ? b : -b;

        while (b != 0) { // Run this loop until the second number (in this loop used as a remainder) is 0. If the second number 0 then the GCD is the first number
            int temp = b; // a temporal variable to store the value of b (smaller of two numbers). Later will be used to store the common divisor.
            b = a % b; // b is now a remainder of the division between a and b. Unless it's 0 the loop keep going.
            a = temp; // a has a value of b now. The variable a will be getting smaller and smaller until the remainder (b) is 0. At that point a is our GCD.
        }
        return a;
    }

    public int gcd_recursion(int a, int b) { // a method that calculates the greatest common divisor by using the recursion
        a = (a > 0) ? a : -a; // Checking if a number is negative. If so, changing it to the positive
        b = (b > 0) ? b : -b;

        if (b == 0) { // if the second number is 0 then the GCD is the first number
            return a;
        }
        else
            return gcd_recursion(b, a % b); // if the second number is not 0 then we call the method one more time. This time the first number is b and the second the remainder of the division of a and b
    }
}
