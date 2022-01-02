package DSA_29_Dec_21;

import java.util.Scanner;

public class Average {
    static double avgRec(int a[], int i, int n) {
        if (i == n - 1)
            return a[i];
        if (i == 0)
            return ((a[i] + avgRec(a, i + 1, n)) / n);
        return (a[i] + avgRec(a, i + 1, n));
    }

    static double average(int a[], int n) {
        return avgRec(a, 0, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(average(arr, n));
        sc.close();
    }
}
