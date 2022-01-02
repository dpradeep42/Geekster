package DSA_30_Dec_21;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt(), powerRaised = sc.nextInt();
        int result = power(base, powerRaised);
        System.out.println(base + "^" + powerRaised + "=" + result);
        sc.close();
    }

    public static int power(int base, int powerRaised) {
        if (powerRaised != 0) {
            return (base * power(base, powerRaised - 1));
        } else {
            return 1;
        }
    }
}
