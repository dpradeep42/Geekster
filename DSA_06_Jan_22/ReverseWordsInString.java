package DSA_06_Jan_22;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<String> stack = new Stack<String>();
        String strarr[] = str.split(" ");
        for (String s : strarr) {
            stack.push(s);
        }
        while (stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }
        sc.close();
    }

}