package Assignment;

import java.util.Scanner;

public class NumberOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;

        while(num > 0){
            count += 1;
            num /= 10;
        }
        System.out.println("Number of Digits in " + temp + " is " + count);
        sc.close();
    }
}
