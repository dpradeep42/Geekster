package Assignment_23_Nov_2021;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the binary number");
        int binary = s.nextInt();
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        System.out.println("binary to decimal number is: " + decimal);
        s.close();
    }
}