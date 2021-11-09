package Nov_10_2021;

import java.util.Scanner;

public class Class_2_task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        if(a > b){
            System.out.println("A is Greater");
        }
        else if(b > a){
            System.out.println("B is Greater");
        }
        else{
            System.out.println("Both are Equal");
        }
    }
}
