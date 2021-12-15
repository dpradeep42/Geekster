package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        float time = 0;
        for (int i = 0; i < t; i++) {
            String s = sc.next();

            char[] l = { 'd', 'f' };
            char[] r = { 'j', 'k' };

            char a = s.charAt(0);
            List<char[]> al = Arrays.asList(l);
            Boolean b = Arrays.asList(l).contains(a);

            String h = Arrays.asList(l).contains(s.charAt(0)) == true ? "l" : "r";

            System.out.println(h);

        }
        sc.close();
    }
}