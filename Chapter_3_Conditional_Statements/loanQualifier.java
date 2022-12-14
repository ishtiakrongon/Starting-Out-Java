package Chapter_3_Conditional_Statements;
import java.util.Scanner;

/**
    This program demonstrates a nested if statement.
 */

public class loanQualifier {
    
    public static void main (String[] args) {

        double salary, yearsOnJob;

        // Creating Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Get the user's annual salary
        System.out.print("Enter your Salary: ");
        salary = keyboard.nextDouble();

        // Get the number of years at the current job.
        System.out.print("Enter the number of years " +
                            "of your current job: ");
        yearsOnJob = keyboard.nextDouble();

        // Determine whether the user qualifies for the loan.
        if (salary >= 30000) {

            if (yearsOnJob >= 2) {

                System.out.println("You are qualified for the loan.");

            } else {

                System.out.println("You must have been " +
                                    "on your current job for at least " +
                                    "two years to qualify.");

            }

        } else {

            System.out.println("You must earn at least " +
                                "$30,000 per year to qualify.");

        }

    }

}
