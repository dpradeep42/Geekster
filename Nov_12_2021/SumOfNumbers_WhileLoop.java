package Nov_12_2021;

import java.util.Scanner;

public class SumOfNumbers_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n th number : ");
        int n = sc.nextInt();
        int sum = 0, i = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("The sum of first " + n + "numbers is " + sum);

        sc.close();
    }
}
