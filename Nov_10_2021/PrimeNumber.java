package Nov_10_2021;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        if(n <= 1)
            System.out.println("Not a Prime");
        else if(n == 2)
            System.out.println("Is a Prime");
        else if(n % 2 == 0)
            System.out.println("Not a Prime");
        else{
            for(int i = 3; i <= Math.sqrt(n); i+= 2){
                if(n % i == 0)
                    System.out.println("Not a Prime");
                else
                    System.out.println("Is a Prime");
            }
        }
        sc.close();
    }
}
