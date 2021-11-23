package Assignment_22_Nov_2021;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Array element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of Array" + Arrays.toString(arr) + " is " + IntStream.of(arr).sum());
        sc.close();
    }
}
