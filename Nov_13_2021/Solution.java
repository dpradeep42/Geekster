package Nov_13_2021;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        if (basic == 0)
            System.out.println("0");
        else
            System.out.println(computeSalary(basic, grade));
        sc.close();
    }

    static int computeSalary(int basic, char grade) {
        double allowance;
        double hra, da, pf;

        hra = 0.2 * basic;
        da = 0.5 * basic;
        pf = 0.11 * basic;

        if (grade == 'A') {
            allowance = 1700.0;
        } else if (grade == 'B') {
            allowance = 1500.0;
        } else {
            allowance = 1300.0;
        }
        double gross;

        gross = Math.round(basic + hra + da + allowance - pf);

        return (int) gross;

    }
}