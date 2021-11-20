package Assignment_19_Nov_2021;

import java.util.Scanner;

public class TwoNumbersAndOperator {

    static String solve(int a, int b, char o) {
        switch (o) {
        case '+':
            return Integer.toString(a + b);
        case '-':
            return Integer.toString(a - b);
        case '*':
            return Integer.toString(a * b);
        case '/':
            return Float.toString((float) a / b);
        default:
            return "You've entered an Invalid operator";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();

        System.out.print("Enter operator : ");
        char ch = sc.next().charAt(0);

        System.out.println(n1 + " " + ch + " " + n2 + " = " + solve(n1, n2, ch));

        sc.close();
    }
}
