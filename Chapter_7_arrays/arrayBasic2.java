package Chapter_7_arrays;

public class arrayBasic2 {
    
    public static void main(String[] args) {

        String[] cars = new String[3];

        cars[0] = "Toyota";
        cars[1] = "Audi";
        cars[2] = "Tesla";

        for (int i = 0; i <= cars.length; i++) {

            System.out.println(cars[i]);

        }

    }

}
