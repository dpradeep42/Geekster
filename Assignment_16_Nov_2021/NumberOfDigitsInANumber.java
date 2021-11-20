package Assignment_16_Nov_2021;

import java.util.Scanner;

public class NumberOfDigitsInANumber {

    static int numberOfDigits(int num) {
        return Integer.toString(num).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(n + " has " + numberOfDigits(n) + " digits.");

        sc.close();
    }
}
