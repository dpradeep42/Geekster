package Nov_10_2021;

import java.util.Scanner;

public class Class_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Name : ");
        String myInput = sc.nextLine();
        
        System.out.println("You've entered " + myInput);

        System.out.print("Enter your Age : ");
        int age = sc.nextInt();

        System.out.println("Your age is " + age);
        System.out.println(age + "is your age");
    }
}
