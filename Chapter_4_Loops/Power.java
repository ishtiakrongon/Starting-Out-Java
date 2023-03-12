public class Power {
    
    public static void main(String[] args) {
        // Compute integers power of 2

        int result, e;

        for (int i = 0; i < 10; i++) {

            result = 1;
            e = i;

            while(e > 0) {

                result = result * 2;
                e--;
            }

            System.out.println("2 to the " + i + " power is " + result);

        }
    }

}
