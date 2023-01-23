package Chapter_3_Conditional_Statements;
import java.util.Scanner;

public class LoanQualifier {
    
    public static void main(String[] args)
    {
        int salary, yearsOnJob;
        Scanner keyboard = new Scanner(System.in);

        // get the input of salary
        System.out.print("Enter your salary: ");
        salary = keyboard.nextInt();

        // get the total years of experience in work
        System.out.print("Enter your work experience in years: ");
        yearsOnJob = keyboard.nextInt();

        // Close the input
        keyboard.close();

        // Nested if-else statements
        if(salary >= 30000)
        {
            if(yearsOnJob >= 2)
            {
                System.out.println("You qualify for the loan.");
            }
            else
            {
                System.out.print("You must have been on your current job for at least two years to qualify.");    
            }
        }
    }

}
