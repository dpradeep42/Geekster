package DSA_21_Dec_21;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum2InputArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target Sum : ");
        int target = sc.nextInt();
        System.out.println("The searched elemet found at " + Arrays.toString(s.twoSum(arr, target)));
        sc.close();
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = 0, reset = 0;
        for(i = 0; i < numbers.length - 1; i++){
            for(j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    reset = 1;
                    break;
                }
            }
            if(reset == 1)
                break;
        }
        int[] res = {i + 1, j + 1};
        return res;
    }
}