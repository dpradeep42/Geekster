package Assignment_11_Nov_2021;

import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        int fact = 1, i = 1;
        if(n < 1)
            System.out.println("1");
        else{
            while(i <= n){
                fact *= i;
                i++;
            }
            System.out.println("The factorial of " + n + " is " + fact);
        }
        
        sc.close();
    }
}
