package DSA_20_Dec_21;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution1 s = new Solution1();
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The root of the given number is : " + s.mySqrt(n));
        sc.close();
    }
}

class Solution1 {
    public int mySqrt(int x) {
        int l = 1, r = x / 2, ans = 0;
        if(x <= 1)
            return x;
        else{
        while(l <= r){
            int m = l + (r - l) / 2;
            long temp = (long)m * (long)m;
            if(temp == x)
                return m;
            if(temp < x){
                ans = m;
                l = m + 1;
            }
            else
                r = m - 1;
        }
        return ans;
        }
    }
}