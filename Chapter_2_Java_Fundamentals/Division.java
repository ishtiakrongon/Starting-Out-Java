package Chapter_2_Java_Fundamentals;

import java.util.Scanner;

public class Division {
    
    public static void main(String[] args) {

        double a, b;        // Division operands
        double quotient;    // Result of Division

        // Create a Scanner object for keyboard input.
        Scanner inputValue = new Scanner(System.in);

        // Get the first number
        System.out.print("Enter a number: ");
        a = inputValue.nextDouble();

        // Get the second number
        System.out.print("Enter another number: ");
        b = inputValue.nextDouble();

        if (b == 0) {

            System.out.println("Division by zero is not possible.");
            System.out.println("Please run the program again and ");
            System.out.println("Enter a number other than zero.");         

        } else {

            quotient = a / b;
            System.out.print("The quotient of " + a);
            System.out.print(" divided by " + b);
            System.out.println(" is " + quotient);

        }
    }

}
