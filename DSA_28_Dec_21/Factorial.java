package DSA_28_Dec_21;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
        sc.close();
    }
}
