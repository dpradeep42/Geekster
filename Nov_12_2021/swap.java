package Nov_12_2021;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("first number = " + n1);
        System.out.println("second number = " + n2);
        sc.close();
    }
}
