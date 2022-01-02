package DSA_27_Dec_21;

import java.util.Scanner;

public class WaveMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix2 m = new Matrix2();
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt();
        int[][] arr = m.createMatrix(row, col);
        m.WavePrint(arr, row, col);
        sc.close();
    }
}

class Matrix2 {
    public int[][] createMatrix(int row, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];
        System.out.println("Enter the Matrix rows one after one");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }

    public void WavePrint(int[][] arr, int m, int n) {
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}