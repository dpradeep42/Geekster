package Nov_13_2021;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing triangle n *s as base");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int space = (n * 2) - 2;
        System.out.println(space);
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int s = 0; s < space; s++){
                System.out.print("'");
            }
            space -= 2;
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }

        sc.close();
    }
}
