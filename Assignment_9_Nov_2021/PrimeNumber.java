package Assignment_9_Nov_2021;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt(), count = 0;
        if (n <= 1)
            count = 1;
        else

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
        if (count > 0)
            System.out.println(n + " is Not a Prime");
        else
            System.out.println(n + " is a Prime");

        sc.close();
    }
}
