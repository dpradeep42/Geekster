package Assignment_17_Nov_2021;

import java.util.Scanner;

public class GradesOfStudent {
    public static String findGrade(int m) {
        return m >= 90 && m <= 100 ? "A+"
                : m >= 80 && m <= 89 ? "A"
                        : m >= 70 && m <= 79 ? "B"
                                : m >= 60 && m <= 69 ? "C" : m >= 50 && m <= 59 ? "D" : m < 50 ? "Fail" : "Invalid";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();
        System.out.println("The entered marks are of Grade " + findGrade(marks));

        sc.close();
    }
}
