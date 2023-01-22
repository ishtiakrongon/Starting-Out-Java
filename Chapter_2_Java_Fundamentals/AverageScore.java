package Chapter_2_Java_Fundamentals;

import java.util.Scanner;

public class AverageScore {
    
    public static void main (String[] args) {

        double score1;      // To hold score #1
        double score2;      // To hold score #2
        double score3;      // To hold score #3
        double average;     // To hold the average score
        String input;       // To hold the user's input

        // Creating a scanner object to take input
        Scanner keyboard = new Scanner(System.in);

        // Get the first test score
        System.out.println("Enter Score #1: ");
        score1 = keyboard.nextDouble();

        // Get the second test score
        System.out.println("Enter Score #2: ");
        score2 = keyboard.nextDouble();

        // Get the third score
        System.out.println("Enter Score #3: ");
        score3 = keyboard.nextDouble();

        keyboard.close();

        // Calculate the average score
        average = (score1 + score2 + score3) / 3.0;

        // Display the average score
        System.out.println("The average is " + average);

        // If the score was greater than 95. let the user know
        // that's a great score.

        input = "That's a great score";

        if (average > 95) {

            System.out.println(input);

        }
        else {

            System.out.println("Good Work!");
        }
    }

}
