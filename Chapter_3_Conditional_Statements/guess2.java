package Chapter_3_Conditional_Statements;

public class guess2 {
    
    public static void main(String[] args)
    throws java.io.IOException {

        char ch, answer = 'k';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("Your guess is correct.");
        else System.out.println("Oops! try again!");

    }

}
