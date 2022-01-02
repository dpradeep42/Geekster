package DSA_28_Dec_21;

import java.util.Scanner;

public class FibanocciRecursive {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.print(n1 + " " + n2);
        printFibonacci(count - 2);
        sc.close();
    }
}
