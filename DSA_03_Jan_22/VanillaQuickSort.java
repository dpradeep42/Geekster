package DSA_03_Jan_22;

import java.util.Arrays;
import java.util.Scanner;

public class VanillaQuickSort {
    public static int[] quickSort(int[] arr, int elements) {
        if (elements < 2) {
            return arr;
        }

        int current_position = 0;
        int temp;

        for (int i = 1; i < elements; i++) {
            if (arr[i] <= arr[0]) {
                current_position++;
                temp = arr[i];
                arr[i] = arr[current_position];
                arr[current_position] = temp;

            }
        }

        temp = arr[0];
        arr[0] = arr[current_position];
        arr[current_position] = temp;

        int[] left = quickSort(arr, current_position);

        int[] arr2 = Arrays.copyOfRange(arr, current_position + 1, elements);

        int[] right = quickSort(arr2, elements - current_position - 1);
        int[] final_array = new int[elements];
        for (int i = 0; i < current_position; i++) {
            final_array[i] = left[i];
        }
        final_array[current_position] = arr[current_position];
        for (int i = current_position + 1; i < elements; i++) {
            final_array[i] = right[i - current_position - 1];
        }

        return final_array;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array Elements one after one :");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = quickSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        sc.close();
    }

}