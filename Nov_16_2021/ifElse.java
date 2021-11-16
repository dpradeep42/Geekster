package Nov_16_2021;

import java.util.Scanner;

public class ifElse {
    public static boolean checkEligibility(int age) {
        if (age >= 18)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        
        if (checkEligibility(age))
            System.out.println("You're eligible to Vote");
        else
            System.out.println("You're not eligible to Vote");

        sc.close();
    }
}
