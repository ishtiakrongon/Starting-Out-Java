package Chapter_4_loops;

public class squares {
    
    public static void main (String[] args) {

        int number;     // Loop control variable

        System.out.println("Number Number Squared");
        System.out.println("------------------------");

        for (number = 1; number <= 10; number++) {

            System.out.println(number + "\t\t" +
                                number * number);

        }

    }

}
