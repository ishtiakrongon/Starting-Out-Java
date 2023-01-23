import java.util.Scanner;

public class TestAverage1 {
    
    public static void main(String[] args)
    {
        int score1, score2, score3;     // Three test scores
        double average;                 // Average test score
        char repeat;                    // To hold 'y' or 'n'
        String input;                   // To hold input

        System.out.println("This program calculates the " +
                            "average of three test scores.");
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get as many sets of test scores as the user wants.

        do {

            // Get the first test score in the set.
            System.out.println("Enter test score 1: ");
            score1 = keyboard.nextInt();

            // Get the second test score in the set.
            System.out.println("Enter test score 2: ");
            score2 = keyboard.nextInt();

            // Get the third test score in the test.
            System.out.println("Enter test score 3: ");
            score3 = keyboard.nextInt();


            // Calculate and print the average test score.
            average = (score1 + score2 + score3) / 3.0;
            System.out.println("The average is " + average);
            System.out.println();

            // Does the user want to average another set?
            System.out.println("Would you like to average " +
                                "another set of test scores?");
            System.out.println("Enter Y for yes or N for no: ");

            input = keyboard.nextLine();    // Read a line.
            repeat = input.charAt(0); // Get the first character.
            

            // Closing the input
            keyboard.close();

        }   while (repeat == 'Y' || repeat == 'y');
    }

}
