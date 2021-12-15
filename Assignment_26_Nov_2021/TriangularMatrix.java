package Assignment_26_Nov_2021;

import java.util.Scanner;

public class TriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            System.out.println("Row" + (i + 1));
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Print the matrix
        System.out.println("Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Lower Triangular Matrix
        System.out.println("Lower Triangular Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Upper Triangular Matrix
        System.out.println("Upper Triangular Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}