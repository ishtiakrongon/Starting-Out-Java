package Chapter_2_Java_Fundamentals;
import java.util.Scanner;
public class CharEnter {
    
    public static void main(String[] args)
    {
        String input;
        char answer;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Ask the user a question.
        System.out.print("Are you having fun? (Y=yes, N=no) ");
        input = keyboard.nextLine(); // get a line of input
        answer = input.charAt(0); // get the first character
        keyboard.close();

        System.out.println("You have selected " + answer);
    }

}
