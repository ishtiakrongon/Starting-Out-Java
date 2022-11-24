package Chapter_2_Java_Fundamentals;

public class Wages {
    
    public static void main(String[] args) {

        // This program calculates hourly wages plus overtime.

        double regularWages;            // The calculated regular wages.
        double basepay = 25;            // The base pay rate.
        double regularHours = 40;       // The hours worked less overtime.
        double overtimeWages;
        double overtimePay = 37.5;      // Overtime pay rate.
        double overtimeHours = 10;      // Overtime hours worked.
        double totalWages;              // Total Wages

        regularWages = basepay * regularHours;
        overtimeWages = overtimePay * overtimeHours;
        totalWages = regularWages + overtimeWages;

        System.out.println("Wages for this week are $" +
                            totalWages);
    }

}
