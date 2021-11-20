package Assignment_18_Nov_2021;

import java.util.Scanner;

public class MaxOfTwoUsingTernaryOperator {

    static int max(int a, int b){
        return a > b ? a : b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("The max of " + a + " and " + b + " is " + max(a, b));

        sc.close();
    }
}