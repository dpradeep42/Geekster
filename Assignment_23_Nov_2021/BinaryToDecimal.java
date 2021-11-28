package Assignment_23_Nov_2021;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.parseInt(Integer.toString(n), 2));
    }
}
