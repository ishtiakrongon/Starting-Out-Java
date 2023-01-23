package Chapter_3_Conditional_Statements;
import java.util.Scanner;

/***********************************************************************
 MULTIPLE NESTED DECISION PROBLEM 
  
    TEST SCORE      GRADE
    90 - above      A
    80 - 89         B
    70 - 79         C
    60 - 69         D
    Below  60       F

 ***********************************************************************/


public class NestedDecision {
    public static void main(String[] args)
    {
        int testScore;
        Scanner keyboard = new Scanner(System.in);

        // get the test score
        System.out.println("Enter the test score: ");
        testScore = keyboard.nextInt();

        // close the input method
        keyboard.close();

        // Nested-if else 

        if (testScore > 0) {

            if (testScore >= 90 && testScore <= 100) {

                System.out.println("Your test Score is: " + testScore);
                System.out.println("Your Grade is A");

            }
            else if (testScore >= 80 && testScore <= 89) {

                System.out.println("Your test Score is: " + testScore);
                System.out.println("Your Grade is B");

            }
            else if (testScore >= 70 && testScore <= 79) {

                System.out.println("Your test Score is: " + testScore);
                System.out.println("Your Grade is C");

            }
            else if (testScore >= 60 && testScore <= 69) {

                System.out.println("Your test Score is: " + testScore);
                System.out.println("Your Grade is D");

            }
            else if(testScore < 60) {
                System.out.println("Your test Score is: " + testScore);
                System.out.println("Your Grade is F");
            }

        }
        else {
            System.out.println("Wrong Input!");
            System.out.println("Please input values between 0 - 100.");
        }

    }
}
