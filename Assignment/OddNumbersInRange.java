package Assignment;

import java.util.Scanner;

public class OddNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        if (b > a) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
