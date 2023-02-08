package Chapter_7_arrays;

public class arrayBasic {
    
    public static void main(String[] args) {

        // arrays = used to store multiple values in a single variable

        String[] cars = {"Camero", "Toyota", "Audi", "Bmw", "Corvette", "Tesla"};

        cars[0] = "Mustang";

        int count = 5;

        for(int i = 0; i <= count; i++) {
            System.out.println(cars[i]);
        }
    }
}
