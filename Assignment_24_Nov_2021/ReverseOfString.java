package Assignment_24_Nov_2021;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Enter the word :");
        str = sc.nextLine();
        char[] arr = str.toCharArray();

        String s = "";

        for (int i = (arr.length) - 1; i >= 0; i--) {
            s = s + arr[i];
        }
        System.out.println("Reversed String : " + s);

        if (str.equalsIgnoreCase(s))
            System.out.println(str + " - is a palindrome!!");
        else
            System.out.println(str + " - is not a palindrome!!");

        sc.close();
    }
}
