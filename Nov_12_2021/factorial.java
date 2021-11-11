package Nov_12_2021;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        int fact = 1;
        if(n < 1)
            System.out.println("1");
        else{
            for(int i = 1; i <= n; i++){
                fact *= i;
            }
            System.out.println(fact);
        }
        
        sc.close();
    }
}
