package Nov_11_2021;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        // Declaration
        int intArray[];
        intArray = new int[20]; // allocating memory to array
        System.out.println(Arrays.toString(intArray));

        int[] intArray4 = new int[20]; // Declaring and allocating memory at a time
        System.out.println(Arrays.toString(intArray4));

        int[] intArray5 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(intArray5));
        // Declaring array literal

        int[] intArray6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(intArray6));
    }
}
