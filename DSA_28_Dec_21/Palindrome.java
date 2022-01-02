package DSA_28_Dec_21;

import java.util.Scanner;

public class Palindrome {
    public static int palindrome_check(char[] s, int start, int end) {
        if (start == end || (end - start == 1)) {
            return 1;
        } else {
            if (s[start] == s[end]) {
                return palindrome_check(s, start + 1, end - 1);
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a[] = s.toCharArray();
        int n = s.length();
        if (palindrome_check(a, 0, n - 1) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
