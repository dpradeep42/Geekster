package Assignment_10_Nov_2021;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Fahrenheit, Celsius;
        System.out.print("Enter the temperature in Fahrenheit : ");
        Fahrenheit = sc.nextFloat();
        Celsius = ((Fahrenheit - 32) * 5) / 9;
        System.out.println(Fahrenheit + " in celsius is " + Celsius);
        sc.close();
    }
}
