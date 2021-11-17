package Assignment_8_Nov_2021;

import java.util.Scanner;

public class MinOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter second Number : ");
        int n2 = sc.nextInt();

        if (n1 > n2)
            System.out.print(n2 + " is smaller than " + n1);
        else if (n1 < n2)
            System.out.print(n1 + " is smaller than " + n2);
        else
            System.out.print(n1 + " and " + n2 + " are equal");

        sc.close();
    }
}
