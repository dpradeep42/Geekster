package Nov_16_2021;

import java.util.Scanner;

public class name_function {
    public static String addNames(String fn, String ln){
        return fn + " " + ln;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        System.out.println("Your full name is " + addNames(firstName, lastName));
        sc.close();
    }
}
