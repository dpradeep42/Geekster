package DSA_03_Jan_22;

import java.util.Scanner;

public class MergeSortCharacterArray {
    public static void merge(char[] left_arr, char[] right_arr, char[] arr, int left_size, int right_size) {
        int i = 0, l = 0, r = 0;
        while (l < left_size && r < right_size) {

            if ((int) left_arr[l] > (int) right_arr[r]) {
                arr[i++] = left_arr[l++];
            } else {
                arr[i++] = right_arr[r++];
            }
        }
        while (l < left_size) {
            arr[i++] = left_arr[l++];
        }
        while (r < right_size) {
            arr[i++] = right_arr[r++];
        }
    }

    public static void mergeSort(char[] arr, int len) {
        if (len < 2) {
            return;
        }
        int mid = len / 2;
        char[] left_arr = new char[mid];
        char[] right_arr = new char[len - mid];
        int k = 0;
        for (int i = 0; i < len; ++i) {
            if (i < mid) {
                left_arr[i] = arr[i];
            } else {
                right_arr[k] = arr[i];
                k = k + 1;
            }
        }
        mergeSort(left_arr, mid);
        mergeSort(right_arr, len - mid);
        merge(left_arr, right_arr, arr, mid, len - mid);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();

        char[] chars = new char[n];

        System.out.println("Enter the array Elements one after one :");

        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }

        mergeSort(chars, n);

        for (int i = 0; i < n; i++) {
            System.out.print(chars[i] + " ");
        }
        sc.close();
    }
}