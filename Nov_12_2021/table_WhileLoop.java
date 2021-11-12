package Nov_12_2021;

import java.util.Scanner;

public class table_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt(), i = 1;
        while(i <= 10){
            System.out.println(n + " x " + i + " = " + n*i);
            i++;
        }
        sc.close();
    }
}
