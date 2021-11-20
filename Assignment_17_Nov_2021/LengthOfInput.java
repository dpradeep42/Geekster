package Assignment_17_Nov_2021;

import java.util.Scanner;

public class LengthOfInput {

    static String lengthOfInput(int num) {
        int length = Integer.toString(num).length();
        return length == 0 ? "Zero"
                : length == 1 ? "One"
                        : length == 2 ? "Two"
                                : length == 3 ? "Three" : length == 4 ? "Four" : length == 5 ? "Five" : "More than 5";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(n + " has " + lengthOfInput(n) + " digit(s)");

        sc.close();
    }
}
