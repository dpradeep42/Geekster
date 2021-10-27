package Assignments;

import java.util.Scanner;

public class Loops_ForLoop {
    public static void main(String[] args) {
        //For loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        //Numbers from 0 to n
        System.out.println("\nNumbers from 0 to n");
        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }

        //Numbers from 1 to n
        System.out.println("\nNumbers from 1 to n");
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }

        //Numbers from 0 to n with 2 difference
        System.out.println("\nNumbers from 1 to n with 2 difference");
        for(int i = 0; i <= n; i+=2){
            System.out.println(i);
        }

        //Numbers from 1 to n with 3 difference
        System.out.println("\nNumbers from 1 to n with 3 difference");
        for(int i = 1; i <= n; i+=3){
            System.out.println(i);
        }

        //Numbers from n to 0
        System.out.println("\nNumbers from n to 0");
        for(int i = n; i >= 0; i--){
            System.out.println(i);
        }

        //Printing table of a number upto 20
        System.out.print("Enter a number to print table : ");
        int num = sc.nextInt();
        for(int i = 1; i <= 20; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
        sc.close();
    }
}
