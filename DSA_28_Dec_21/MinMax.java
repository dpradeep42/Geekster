package DSA_28_Dec_21;

import java.util.Scanner;

public class MinMax {
    public static int findMaxRec(int A[], int n) {
        if (n == 1)
            return A[0];
        return Math.max(A[n - 1], findMaxRec(A, n - 1));
    }

    public static int findMinRec(int A[], int n) {
        if (n == 1)
            return A[0];
        return Math.min(A[n - 1], findMinRec(A, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max = " + findMaxRec(arr, n));
        System.out.println("Min = " + findMinRec(arr, n));
        sc.close();
    }
}
