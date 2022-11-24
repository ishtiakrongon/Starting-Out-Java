package Chapter_2_Java_Fundamentals;

import java.util.Scanner;

public class payroll {
    
    public static void main(String[] args) {

        String name;        // To hold a name
        int hours;          // Hours worked
        double payRate;     // Hourly Pay Rate
        double grossPay;    // Gross pay

        // Create a scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the user name
        System.out.println("What is your name? ");
        name = keyboard.nextLine();

        // Get the number of hours worked this week.
        System.out.println("How many hours did you week this week? ");
        hours = keyboard.nextInt();

        // Get the user's hourly pay rate.
        System.out.println("What is your hourly pay rate? ");
        payRate = keyboard.nextDouble();

        // Calculate the gross pay.
        grossPay = hours * payRate;

        // Display the resulting information.
        System.out.print("Hello, " + name + "\n");
        System.out.print("Your gross pay is $" + grossPay);
    }

}
