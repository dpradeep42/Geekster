package Assignment_23_Nov_2021;

import java.util.Scanner;

public class PositiveElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener the Length of the array : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Ener the " + i + " element" + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Ener the Length of second array : ");
        int l2 = sc.nextInt();
        int[] arr2 = new int[l2];
        for (int i = 0; i < l; i++) {
            System.out.print("Ener the " + i + " element" + " : ");
            arr2[i] = sc.nextInt();
        }
        if (arr == arr2)
            System.out.println("Both Arrays are Same");
        else
            System.out.println("Both Arrays are not Same");
        sc.close();
    }
}
