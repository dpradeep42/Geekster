package Assignment_15_Nov_2021;

import java.util.Scanner;

public class ThreeMethodsForMaxValue {

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        return max(a, b) > c ? (max(a, b)) : c;
    }

    static int max(int a, int b, int c, int d) {
        return max(a, b, c) > d ? max(a, b, c) : d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int int1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int int2 = sc.nextInt();

        System.out.print("Enter Third number : ");
        int int3 = sc.nextInt();

        System.out.print("Enter Fourth number : ");
        int int4 = sc.nextInt();

        System.out.println("Max of " + int1 + " and " + int2 + " is " + max(int1, int2));
        System.out.println("Max of " + int1 + ", " + int2 + " and " + int3 + " is " + max(int1, int2, int3));
        System.out.println(
                "Max of " + int1 + ", " + int2 + ", " + int3 + " and " + int4 + " is " + max(int1, int2, int3, int4));

        sc.close();
    }
}
