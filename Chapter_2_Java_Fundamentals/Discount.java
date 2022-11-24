package Chapter_2_Java_Fundamentals;

public class Discount {
    
    public static void main(String[] args) {

        // Variables to hold the regular price, the
        // amount of a discount, and the sale price.
        double regularPrice = 59.0;
        double discount;
        double salesPrice;

        // Calculate the amount of a 20% discount.
        discount = regularPrice * 0.2;

        // Calculate sales price

        salesPrice = regularPrice - discount;

        // Display the results.
        System.out.println("Regular price: $" + regularPrice);
        System.out.println("Discount price $" + discount);
        System.out.println("Sale price: $" + salesPrice);

    }

}
