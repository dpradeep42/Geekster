package Assignment_16_Nov_2021;

import java.util.Scanner;

public class EvenOrOdd {

    static String evenOrOdd(int num) {
        return num != 0 ? Integer.toBinaryString(num).endsWith("0") ? "Even" : "Odd" : "Zero";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(n + " is " + evenOrOdd(n));

        sc.close();
    }
}
