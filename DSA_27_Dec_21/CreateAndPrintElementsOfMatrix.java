package DSA_27_Dec_21;

import java.util.Scanner;

public class CreateAndPrintElementsOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix m = new Matrix();
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt();
        int[][] arr = m.createMatrix(row, col);
        m.displayMatrix(arr, row, col);
        sc.close();
    }
}

class Matrix{
    public int[][] createMatrix(int row, int col){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];
        System.out.println("Enter the Matrix rows one after one");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }

    public void displayMatrix(int[][] arr, int row, int col){
        System.out.println("\nEnter the Matrix is");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}