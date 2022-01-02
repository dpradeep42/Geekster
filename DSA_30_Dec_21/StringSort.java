package DSA_30_Dec_21;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    static void sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sortString(s);
        sc.close();
    }
}