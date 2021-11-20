package Assignment_18_Nov_2021;

import java.util.Scanner;

public class NumberOfDigitsInNumberUsingWhile {

    static int noOfDigits(int num){
        int count = 0;

        while(num > 0){
            count += 1;
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Number of digits in " + n + " are " + noOfDigits(n));

        sc.close();
    }
}
