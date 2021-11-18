package Assignment_15_Nov_2021;

import java.util.Scanner;

public class ThreeMethodsForProduct {
    static int product(int a, int b){
        return a * b;
    }

    static float product(float a, float b){
        return a * b;
    }

    static long product(long a, long b){
        return a * b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Integer : ");
        int int1 = sc.nextInt();

        System.out.print("Enter second Integer : ");
        int int2 = sc.nextInt();

        System.out.println("The product of " + int1 + " and " + int2 + " is " + product(int1, int2));

        System.out.print("Enter first float : ");
        float float1 = sc.nextFloat();

        System.out.print("Enter second float : ");
        float float2 = sc.nextFloat();

        System.out.println("The product of " + float1 + " and " + float2 + " is " + product(float1, float2));

        System.out.print("Enter first long : ");
        long long1 = sc.nextLong();

        System.out.print("Enter second long : ");
        long long2 = sc.nextLong();

        System.out.println("The product of " + long1 + " and " + long2 + " is " + product(long1, long2));

        sc.close();
    }
}
