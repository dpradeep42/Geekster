package DSA_30_Dec_21;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int hcf = gcd(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
        sc.close();
    }

    public static int gcd(int n1, int n2) {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
}
