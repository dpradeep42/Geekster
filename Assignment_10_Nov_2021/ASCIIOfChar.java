package Assignment_10_Nov_2021;

import java.util.Scanner;

public class ASCIIOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII of enetered Character " + ch + " is " + (int)ch);

        sc.close();
    }
}
