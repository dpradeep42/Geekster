package Assignment_11_Nov_2021;

import java.util.Scanner;

public class SumOfNNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n th number : ");
        int n = sc.nextInt(), temp = n;
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println("The sum of first " + temp + " numbers is " + sum);

        sc.close();
    }
}