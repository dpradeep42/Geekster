package DSA_23_Dec_21;

import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution2 s = new Solution2();
        System.out.print("Enter the size of the first Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(s.sortColors(arr)));
        sc.close();
    }
}

class Solution2 {
    public int[] sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = 0;
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}