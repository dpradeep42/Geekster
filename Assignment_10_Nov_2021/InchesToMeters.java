package Assignment_10_Nov_2021;

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inches : ");
        double inches = sc.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches + " inches is equal to " + meters + " meters");

        sc.close();
    }
}
