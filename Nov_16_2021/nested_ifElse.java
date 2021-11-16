package Nov_16_2021;

import java.util.Scanner;

public class nested_ifElse {
    public static char findGrade(int m) {
        if (m >= 90)
            return 'A';
        else if (m >= 80 && m <= 89)
            return 'B';
        else if (m >= 70 && m <= 79)
            return 'C';
        else
            return 'D';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        System.out.println(findGrade(marks));

        sc.close();
    }
}
