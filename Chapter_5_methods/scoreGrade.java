package Chapter_5_methods;
import java.util.Scanner;


public class scoreGrade {
    
    public static void main(String[] args) {

        // input method for java
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter test score of 1st subject: ");
        double test1 = keyboard.nextDouble();

        System.out.println("Enter test score of 2nd subject: ");
        double test2 = keyboard.nextDouble();

        System.out.println("Enter test score of 3rd subject: ");
        double test3 = keyboard.nextDouble();

        System.out.println("Enter test score of 4th subject: ");
        double test4 = keyboard.nextDouble();

        System.out.println("Enter test score of 5th subject: ");
        double test5 = keyboard.nextDouble();

        // Closing
        keyboard.close();

        System.out.println("Grade Report\n");
        System.out.print("-----------------\n");

        System.out.println("Letter grade of 1st subject: " + determineGrade(test1));
        System.out.println("Letter grade of 2nd subject: " + determineGrade(test2));
        System.out.println("Letter grade of 3rd subject: " + determineGrade(test3));
        System.out.println("Letter grade of 4th subject: " + determineGrade(test4));
        System.out.println("Letter grade of 5th subject: " + determineGrade(test5));

        double averageScore = calcAverage(test1, test2, test3, test4, test5);
        System.out.println("Average Test Score: " + averageScore);
    }

    public static double calcAverage(double a, double b, double c, double d, double e) {
        double average;
        average = (a + b + c + d + e) / 5;

        return average;
    }

    /*
     * detemineGrade is a method which return the Letter Grade
     */

    public static double determineGrade(double testScore) {

        double scores = testScore;

        if (scores >= 90 && scores <= 100)
        {
            System.out.println("A");
        }

        else if (scores >= 80 && scores <= 89)
        {
            System.out.println("B");
        }

        else if (scores >= 70 && scores <= 79)
        {
            System.out.println("C");
        }

        else if (scores >= 60 && scores <= 69)
        {
            System.out.println("D");
        }

        else if (scores < 60)
        {
            System.out.println("F");
        }

        return scores;
    }

}
