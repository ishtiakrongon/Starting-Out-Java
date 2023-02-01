package Chapter_5_methods;

/***
 * This program defines and calls a simple method.
 */

// Methods should write within a class

public class simplemethod {

    public static void main(String[] args) {

        System.out.println("Hello from main method.");
        displayMessage();
        System.out.println("Back in the main method.");

    }

    // Creating a greeting message using method technique which is similar to
    // function

    public static void displayMessage() {

        System.out.println("Hello from the display method.");

    }
    
}
