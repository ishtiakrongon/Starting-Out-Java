package Chapter_3_Conditional_Statements;
import java.util.Scanner;


public class Division {
    
    public static void main(String[] args)
    {
        double number1, number2; // Division operands
        double quotient; // Result of division

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the first number
        System.out.println("Enter a number: ");
        number1 = keyboard.nextDouble();

        // Get the second number
        System.out.println("Enter another number: ");
        number2 = keyboard.nextDouble();

        // Close the input method
        keyboard.close();

        if(number2 == 0)
        {
            System.out.println("Division by zero is not possible.");
            System.out.println("Please run the program again and ");
            System.out.println("enter a number other than zero.");
        }
        else
        {
            quotient = number1 / number2;
            System.out.println("The quotient of " + number1);
            System.out.println(" divided by " + number2);
            System.out.println(" is " + quotient);
        }

    }
}
