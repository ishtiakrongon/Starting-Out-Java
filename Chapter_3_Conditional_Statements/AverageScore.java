package Chapter_3_Conditional_Statements;
import java.util.Scanner;

public class AverageScore {
    
    public static void main(String[] args)
    {
        double score1,
               score2,
               score3,
               average;

        // Scanner for input method
        Scanner keyboard = new Scanner(System.in);
        
        // 1st input
        System.out.println("Enter 1st value: ");
        score1 = keyboard.nextDouble();

        // 2nd input
        System.out.println("Enter 2nd value: ");
        score2 = keyboard.nextDouble();

        // 3rd input
        System.out.println("Enter 3rd value: ");
        score3 = keyboard.nextDouble();

        // Close the input method
        keyboard.close();

        // Calculate the average score
        average = (score1 + score2 + score3) / 3.0;

        // Display the average score
        System.out.println("The average score is: " + average);

    }

}
