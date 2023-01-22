package Chapter_2_Java_Fundamentals;
import java.util.Scanner;


public class InputProblem {
    
    public static void main(String[] args)
    {
        String name;    // To hod the user's name
        int age;    // To hold the user's age
        double income;  // To hold the user's income

        // Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);

        // Get the user's name
        System.out.print("What is your name? ");
        name = keyboard.nextLine();

        // Get the user's age
        System.out.print("What is your age? ");
        age = keyboard.nextInt();

        // Get the user's income
        System.out.print("What's is your income? ");
        income = keyboard.nextDouble();

        keyboard.close();

        // Display the information back to user.
        System.out.println("Hello, " + name +". Your age is " +
                            age + " and your income is $" + income);
    }
}
