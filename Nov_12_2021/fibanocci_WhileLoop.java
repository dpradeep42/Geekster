package Nov_12_2021;

import java.util.Scanner;

public class fibanocci_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1, i = 2;
        System.out.print(n1 + " " + n2);

        while(i < n)
        {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            i++;
        }
        sc.close();
    }
}
