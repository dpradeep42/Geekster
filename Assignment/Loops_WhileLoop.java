package Assignment;

import java.util.Scanner;

public class Loops_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        while(n > 0){
            System.out.println(n);
            n--;
        }
        sc.close();
    }
}
