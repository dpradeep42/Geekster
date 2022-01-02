package DSA_29_Dec_21;

import java.util.Scanner;

public class ReversingNumber {
    public static void Reverse(int num) {
        if (num < 10) {
            System.out.println(num);
            return;
        } else {
            System.out.print(num % 10);
            Reverse(num / 10);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Reversed Number: ");
        Reverse(num);
        sc.close();
    }
}
