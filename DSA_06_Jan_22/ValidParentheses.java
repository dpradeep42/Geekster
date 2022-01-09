package DSA_06_Jan_22;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String args[]) {

        String str = "({}){}[]{()[]}";
        Stack<Character> s = new Stack<Character>();
        int n = 0;
        while (n < str.length()) {
            char input = str.charAt(n);
            if ((input == ')' && s.peek() == '(') || (input == '}' && s.peek() == '{')
                    || (input == ']' && s.peek() == '['))
                s.pop();
            else
                s.push(input);
            n++;
        }
        if (s.size() > 0)
            System.out.println("False");
        else
            System.out.println("True");

    }
}