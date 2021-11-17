package Assignment_8_Nov_2021;

import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter second Number : ");
        int n2 = sc.nextInt();

        System.out.println("The average of "+ n1 + " and "+ n2 + " is " + ((float)n1 + n2) / 2);

        sc.close();
    }
}
