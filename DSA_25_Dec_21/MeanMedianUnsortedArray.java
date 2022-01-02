package DSA_25_Dec_21;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianUnsortedArray {
    public static double findMean(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
        return (double) sum / (double) n;
    }

    public static double findMedian(int a[], int n) {
        Arrays.sort(a);
        if (n % 2 != 0)
            return (double) a[n / 2];
        return (double) (a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first Array : ");
        int len = sc.nextInt();
        int[] a = new int[len];
        System.out.print("Enter the Array elements : ");
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        int n = a.length;
        System.out.println("Mean = " + findMean(a, n));
        System.out.println("Median = " + findMedian(a, n));
        sc.close();
    }
}
