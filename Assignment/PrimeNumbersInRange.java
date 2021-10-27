package Assignment;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        if (b > a) {
            for (int num = a; num <= b; num++) {
                int count = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                        if (count > 2) {
                            break;
                        }
                    }
                }
                if (count == 2) {
                    System.out.println(num);
                }
            }
        } else {
            for (int num = a; num >= b; num--) {
                int count = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                        if (count > 2) {
                            break;
                        }
                    }
                }
                if (count == 2) {
                    System.out.println(num);
                }
            }
        }
        sc.close();
    }
}
