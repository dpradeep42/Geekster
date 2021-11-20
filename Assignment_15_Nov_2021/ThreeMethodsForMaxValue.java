package Assignment_15_Nov_2021;

import java.util.Scanner;

public class ThreeMethodsForMaxValue {

    public static Scanner sc = new Scanner(System.in);
    public static int int1, int2, int3, int4;

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        return max(a, b) > c ? (max(a, b)) : c;
    }

    static int max(int a, int b, int c, int d) {
        return max(a, b, c) > d ? max(a, b, c) : d;
    }

    public static void readTwoNumbers() {
        // Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int2 = sc.nextInt();

    }

    public static void readThreeNumbers() {
        // Scanner sc = new Scanner(System.in);
        readTwoNumbers();
        System.out.print("Enter Third number : ");
        int3 = sc.nextInt();
    }

    public static void readFourNumbers() {
        // Scanner sc = new Scanner(System.in);
        readThreeNumbers();
        System.out.print("Enter Fourth number : ");
        int4 = sc.nextInt();
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.print("How many number do you want to comapre (2 / 3 / 4) : ");
        int input = sc.nextInt();
        switch (input) {
        case 2:
            readTwoNumbers();
            System.out.println("Max of " + int1 + " and " + int2 + " is " + max(int1, int2));
            break;

        case 3:
            System.out.println("Max of " + int1 + ", " + int2 + " and " + int3 + " is " + max(int1, int2, int3));
            break;
        case 4:
            System.out.println("Max of " + int1 + ", " + int2 + ", " + int3 + " and " + int4 + " is "
                    + max(int1, int2, int3, int4));
            break;

        default:
            System.out.println("You've entered an invalid input");
        }
    }
}
