package Assignment_22_Nov_2021;

import java.util.Arrays;
import java.util.Scanner;

public class MiddleElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Array element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The Middle element of the Array is " + arr[(int)Math.round((float)n/2)]);
        Arrays.sort(arr);
        System.out.println("The Middle element in the sorted Array is " + arr[(int)Math.round((float)n/2)]);
        sc.close();
    }
}
