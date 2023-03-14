package Chapter_7_arrays;

// One-Dimentional Array

public class ArrayDemo {
    
    public static void main(String[] args) {

        // Declaring an array integers

        int[] myArray;

        // Intializing an array with 10 elements. Also creating a new array object

        myArray = new int[11];

        int valueCount;

        // This loop is for assigning integer values from 0 to 10 in myArray.

        for (valueCount = 0; valueCount < 11; valueCount++) {
            myArray[valueCount] = valueCount;
        }

        // This loop is for printing out the array elements in ascending order

        for (int arrayIndex = 0; arrayIndex < 11; arrayIndex = arrayIndex + 1) {
            System.out.println("This is a sample [" + arrayIndex + "]: " + myArray[arrayIndex]);
        }

    }

}
