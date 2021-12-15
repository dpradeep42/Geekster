package Practice;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        // your code goes here
        int N;
        N = s.nextInt();

        int[] S = new int[N];
        int[] T = new int[N];
        int Sum1 = 0, Sum2 = 0;
        int diff = 0;
        int L = 0;
        int W = 0;

        for (int i = 0; i < N; i++) {
            S[i] = s.nextInt();
            T[i] = s.nextInt();
            Sum1 += S[i];
            Sum2 += T[i];
            if (Sum1 > Sum2) {
                diff = Sum1 - Sum2;
                if (diff > L) {
                    L = diff;
                    W = 1;
                }
            } else {
                diff = Sum2 - Sum1;
                if (diff > L) {
                    L = diff;
                    W = 2;
                }
            }

        }

        System.out.println(W + " " + L);

    }
}
