package Assignment_24_Nov_2021;

import java.util.Scanner;

public class FirstUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Enter the sentence :");
        str = sc.nextLine();
        char[] arr = str.toCharArray();
        String s = "";
        s = s + arr[0];
        s = s.toUpperCase();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != ' ') {
                s = s + arr[i];
            } else if (arr[i] == ' ') {
                String up = "";
                up = up + arr[i + 1];
                up = up.toUpperCase();
                s = s + " " + up;
                i++;
            }
        }
        System.out.println("Modified String :\n" + s);
        sc.close();
    }
}