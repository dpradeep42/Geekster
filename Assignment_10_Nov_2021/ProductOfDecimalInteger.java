package Assignment_10_Nov_2021;

import java.util.Scanner;

public class ProductOfDecimalInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int i = sc.nextInt();

        System.out.print("Enter a Double : ");
        double d = sc.nextDouble();

        System.out.println("Product of " + i + " and " + d + " is " + i * d);
        
        sc.close();
    }
}
