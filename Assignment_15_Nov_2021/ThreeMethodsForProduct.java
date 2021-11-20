package Assignment_15_Nov_2021;

import java.util.Scanner;

public class ThreeMethodsForProduct {
    static int product(int a, int b) {
        return a * b;
    }

    static float product(float a, float b) {
        return a * b;
    }

    static long product(long a, long b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.print(
                    "which numbers do you want to multiply?\n1.Integers \n2.Float \n3.Long \nEnter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {

            case 1:
                System.out.print("Enter first Integer : ");
                int int1 = sc.nextInt();
                System.out.print("Enter second Integer : ");
                int int2 = sc.nextInt();
                System.out.println("The product of " + int1 + " and " + int2 + " is " + product(int1, int2));
                break;

            case 2:
                System.out.print("Enter first float : ");
                float float1 = sc.nextFloat();
                System.out.print("Enter second float : ");
                float float2 = sc.nextFloat();
                System.out.println("The product of " + float1 + " and " + float2 + " is " + product(float1, float2));
                break;

            case 3:
                System.out.print("Enter first long : ");
                long long1 = sc.nextLong();
                System.out.print("Enter second long : ");
                long long2 = sc.nextLong();
                System.out.println("The product of " + long1 + " and " + long2 + " is " + product(long1, long2));
                break;

            default:
                System.out.println("You've entered an invalid input");
            }
            System.out.print("Do you want to continue (Y/N) : ");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        sc.close();
    }
}
