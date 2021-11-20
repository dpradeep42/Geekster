package Assignment_19_Nov_2021;

import java.util.Scanner;

public class NumbersRelation {
    static String relation(int a, int b) {
        return a > b ? a + " is greater than " + b : a < b ? a + " is less than " + b : "Both are equal";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();

        System.out.println(relation(n1, n2));

        sc.close();
    }
}
