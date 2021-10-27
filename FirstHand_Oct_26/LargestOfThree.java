package FirstHand_Oct_26;

import java.io.IOException;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        System.out.println("The largest of three numbers is : " + max(a,b,c));
        sc.close();

    }

    public static int max(int a, int b, int c){
        int largest = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        return largest;
    }
}
