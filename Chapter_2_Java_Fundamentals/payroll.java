package Chapter_2_Java_Fundamentals;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        
        String name; // To hold a name
        int hours; // Hours worked
        double payRate; // Hourly pay rate
        double grossPay; // Gross pay

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the user's name
        System.out.println("What is your name? ");
        name = keyboard.nextLine();

        // Get the number of hours worked this week.
        System.out.println("How many hours did you work this week? ");
        hours = keyboard.nextInt();

        // Get the user's hourly pay rate.
        System.out.print("What is your hourly pay rate? ");
        payRate = keyboard.nextDouble();

        // Get Calculate the gross pay.
        grossPay = hours * payRate;
        keyboard.close();

        // Display the resulting information
        System.out.println("Hello, " + name);
        System.out.println("your gross pay is $" + grossPay);
    }
}
