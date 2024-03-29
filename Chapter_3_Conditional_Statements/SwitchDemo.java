package Chapter_3_Conditional_Statements;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        int number;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get one of the numbers 1, 2, or 3 from the user.
        System.out.print("Enter 1, 2 or 3: ");
        number = keyboard.nextInt();
        keyboard.close();

        // Determine the number entered.
        switch (number)
        {
            case 1:
                System.out.println("You entered 1.");
                break;
            case 2:
                System.out.println("You entered 2.");
                break;
            case 3:
                System.out.println("You entered 3.");
                break;
            default:
                System.out.println("That's not 1, 2, or 3!");
        }

    }
}
