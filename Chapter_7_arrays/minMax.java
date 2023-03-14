package Chapter_7_arrays;


/*
 * Find the minimum and maximum value in an array
 */


public class minMax {
    
    public static void main(String[] args) {

        int[] minMax = new int[10];

        int min, max;

        minMax[0] = 99;
        minMax[1] = -10;
        minMax[2] = 100123;
        minMax[3] = 18;
        minMax[4] = -978;
        minMax[5] = 5623;
        minMax[6] = 463;
        minMax[7] = -9;
        minMax[8] = 287;
        minMax[9] = 49;

        min = max = minMax[0];
        
        for (int i = 1; i < 10; i++) {
            if (minMax[i] < min) min = minMax[i];
            else if (minMax[i] > max) max = minMax[i];
        }

        System.out.println("The minimum value of this array is " + min);
        System.out.println("The maximum value of this array is " + max);

    }

}
