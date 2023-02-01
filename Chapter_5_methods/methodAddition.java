package Chapter_5_methods;
import java.util.Scanner;


public class methodAddition {
    
    public static void main(String[] args) {

        int num1, num2, result;
        Scanner keyboard = new Scanner(System.in);

        // This is a simple addition

        System.out.println("Enter 1st value: ");
        num1 = keyboard.nextInt();

        System.out.println("Enter 2nd value: ");
        num2 = keyboard.nextInt();

        result = showSum(num1, num2);

        System.out.println("The result is " + result);

        keyboard.close();
    }

    public static int showSum(int a, int b) {

        int sum;
        sum = a + b;

        return sum;

    }

}
