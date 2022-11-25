package Chapter_4_loops;
import java.util.Scanner;

public class checkTemperature {
    
    public static void main (String[] args) {

        final double MAX_TEMP = 102.5;
        double temperature;

        // Create a Scaner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the current temperature.
        System.out.print("Enter the substance's Celsius temperature: ");
        temperature = keyboard.nextDouble();

        // As long as necessary, instruct the technician
        // to adjust the temperature.
        while (temperature > MAX_TEMP)
        {
            System.out.println("The tempearature is too high!");
        }

        System.out.println("This temperature is acceptable!");

    }

}
