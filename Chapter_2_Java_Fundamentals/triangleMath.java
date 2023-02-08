package Chapter_2_Java_Fundamentals;
import java.util.Scanner;


public class triangleMath {
    
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter the value of x: ");
        x = keyboard.nextDouble();

        System.out.println("Enter the value of y: ");
        y = keyboard.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The Hypotenuse is: " + z);

        keyboard.close();

    }

}
