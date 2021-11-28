package Assignment_23_Nov_2021;

import java.util.Scanner;

public class IndexOfArrayElement {
    public static int findIndex(int arr[], int t) {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener the Length of the array : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++){
            System.out.print("Ener the " + i + " element" + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Ener the element to be searched : ");
        int n = sc.nextInt();
        System.out.println("Index position of " + n + " is: " + findIndex(arr, n));
        sc.close();
    }
}
