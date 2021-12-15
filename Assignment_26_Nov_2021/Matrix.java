package Assignment_26_Nov_2021;

import java.util.Scanner;

public class Matrix {
    // Return the frequency of even and odd numbers in the array
    public static void frequency(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("Frequency of Even Numbers : " + even);
        System.out.println("Frequency of Odd Numbers : " + odd);
    }

    // To check if a given matrix is a Sparse Matrix
    public static void sparse(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        int size = n * m;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 0)
                    count++;
            }
        }
        if (count > (size / 2))
            System.out.println("-> Sparse Matrix");
        else
            System.out.println("-> Not a Sparse Matrix");
    }

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

        frequency(arr);
        sparse(arr);
        sc.close();
    }
}