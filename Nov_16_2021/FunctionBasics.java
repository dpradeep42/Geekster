package Nov_16_2021;

import java.util.Scanner;

public class FunctionBasics {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
        sc.close();
    }
}
