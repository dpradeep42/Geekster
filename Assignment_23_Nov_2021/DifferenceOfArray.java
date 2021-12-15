package Assignment_23_Nov_2021;

import java.util.Scanner;

public class DifferenceOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = s.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n];
        System.out.println("enter the first array element:");
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("enter the 2nd array element:");
        for (int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }
        System.out.println("differenc of the two array element:");
        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] - arr2[i];
            System.out.println(result[i]);
        }

    }
}