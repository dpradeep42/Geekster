package Assignment_12_Nov_2021;

import java.util.Scanner;

public class ReversePyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        for(int i = n; i > 0; i--){
            System.out.println();
            for(int s = 0; s < n - i; s++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }
        sc.close();
    }
}
