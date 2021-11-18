package Assignment_10_Nov_2021;

import java.util.Scanner;

public class PrintintIntDoubleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int i = sc.nextInt();
        System.out.println(i);

        System.out.print("Enter a Double : ");
        double d = sc.nextDouble();
        System.out.println(d);
        
        System.out.print("Enter a Character : ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        sc.close();
    }
}
