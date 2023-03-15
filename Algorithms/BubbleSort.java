package Algorithms;

public class BubbleSort {
    
    // Declaring method
    static void bubbleSort(int[] array) {
        
        int size = array.length;
        int a, b, temp;

        // Bubble sort loop
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                
                if (array[b - 1] > array[b]) {

                    temp = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };

        System.out.println("Array before sorted: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        bubbleSort(nums);

        System.out.println("Array after sorted: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
