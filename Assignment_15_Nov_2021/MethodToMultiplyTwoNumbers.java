package Assignment_15_Nov_2021;

import java.util.Scanner;

public class MethodToMultiplyTwoNumbers {

    static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second Number : ");
        int num2 = sc.nextInt();

        System.out.println("The product of " + num1 + " and " + num2 + " is " + product(num1, num2));

        sc.close();
    }
}
