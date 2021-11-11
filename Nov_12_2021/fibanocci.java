package Nov_12_2021;

import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < n; ++i)
        {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
