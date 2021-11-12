package PreCourseAssignment;

import java.util.Scanner;

public class Loops_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        do{
            System.out.println(n);
            n--;
        }
        while(n > 0);
        sc.close();
    }
}
