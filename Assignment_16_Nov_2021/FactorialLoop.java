package Assignment_16_Nov_2021;

import java.util.Scanner;

public class FactorialLoop {

    static long factorial(int num) {
        return (num == 1 || num == 0) ? 1 : num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input;

        do {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            System.out.println("Factorial of " + n + " is " + factorial(n) + ".");

            System.out.print("Do you want to continue (Y/N) : ");
            input = sc.next().charAt(0);
        } while (input == 'Y' || input == 'y');

        sc.close();
    }
}
