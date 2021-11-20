package Assignment_18_Nov_2021;

import java.util.Scanner;

public class MaxOfThreeUsingTernaryOperator {

    static int max(int a, int b, int c){
        return a > b ? a : b > c ? a > b ? a : b : c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.print("Enter the third number : ");
        int c = sc.nextInt();

        System.out.println("The max of " + a + ", " + b + " and " + c + " is " + max(a, b, c));

        sc.close();
    }
}