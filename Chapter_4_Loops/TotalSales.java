import java.util.Scanner;

public class TotalSales {

    public static void main(String[] args) {

        int days, count;
        double sales;
        double totalSales;
        
        // Scanner input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many days do you have sales figures? ");
        days = keyboard.nextInt();

        // close input
         keyboard.close();

        // Set the accumalator to 0.
        totalSales = 0.0;

        // get the sales figures and calculate a running total.

        for (count = 1; count <= days; count++) {

            System.out.println("Enter the Sales: ");
            sales = keyboard.nextDouble();
            totalSales += sales; // Add sales to totalSales

        }

        // Display the total sales.

        System.out.printf("The total sales are $%,.2f", totalSales);
    }

}