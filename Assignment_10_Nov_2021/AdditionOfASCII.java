package Assignment_10_Nov_2021;

import java.util.Scanner;

public class AdditionOfASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Character : ");
        char ch1 = sc.next().charAt(0);

        System.out.print("Enter Second Character : ");
        char ch2 = sc.next().charAt(0);

        System.out.print("Enter Third Character : ");
        char ch3 = sc.next().charAt(0);

        int ch = ch1 + ch2 + ch3;

        System.out.println("ASCII sum of enetered Characters is " + ch + " and it's ASCII character is " + (char)ch);

        sc.close();
    }
}
