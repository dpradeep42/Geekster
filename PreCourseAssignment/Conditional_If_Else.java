package PreCourseAssignment;

import java.util.Scanner;

public class Conditional_If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("A is Greater");
        }
        else if(b > a){
            System.out.println("B is Greater");
        }
        else{
            System.out.println("Both are equal");
        }

        //Ternary Operator
        System.out.println(a > b ? a : b + "is greater");
        sc.close();
    }
}
